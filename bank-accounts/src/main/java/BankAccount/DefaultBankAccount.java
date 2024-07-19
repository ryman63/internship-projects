package BankAccount;

public class DefaultBankAccount extends BankAccount
{
    public final Money  FINE = new Money(100, 0);
    public final Money  MIN_AMOUNT = new Money(5000, 0);

    private Money previousAmount;
    public DefaultBankAccount()
    {
        serviceFee = new Money(100);
        history = new StringBuilder();
    }

    @Override
    public String openingAccount(String fullName, String pinCode)
    {
        history.append("Тип счёта: обычный\n");
        return super.openingAccount(fullName, pinCode);
    }

    @Override
    protected void serviceFeePayment()
    {
        int result = Math.min(serviceFee.countAllKopecks(), amount.multiply(1 - 0.1).countAllKopecks());

        Money moneyResult = new Money(0, result);

        if(checkAmount(moneyResult))
            super.amount  = super.amount.Minus(moneyResult);
        else
        {
            fineSum = fineSum.Plus(moneyResult.Minus(super.amount));
            super.amount.setToZero();
        }

        if(result > 0)
            operationDetalizing(new String("Автоматическая операция: выплата за обслужививание, на сумму: " + moneyResult));
    }

    @Override
    protected void cashBackAdditional() {
        // кэш бэка нет
    }

    @Override
    public Money withdrawMoney(String pinCode, Money amount)
    {
        previousAmount = new Money(super.amount);
        Money result = super.withdrawMoney(pinCode, amount);
        if(checkPinCode(pinCode)
                && isAccountOpening()
                && super.amount.countAllKopecks() < MIN_AMOUNT.countAllKopecks()
                && previousAmount.countAllKopecks() >= MIN_AMOUNT.countAllKopecks())
        {
            operationDetalizing("Начисление штрафа в размере: " + FINE);
            fineSum = fineSum.Plus(FINE);
            fineAdditional();
        }

        return result;
    }

    @Override
    public boolean payment(String pinCode, Money amount, String src)
    {
        previousAmount = new Money(super.amount);
        boolean result = super.payment(pinCode, amount, src);
        if(result
                && super.amount.countAllKopecks() < MIN_AMOUNT.countAllKopecks()
                && previousAmount.countAllKopecks() > MIN_AMOUNT.countAllKopecks())
        {
            fineSum = fineSum.Plus(FINE);
            fineAdditional();
        }

        return result;
    }
}
