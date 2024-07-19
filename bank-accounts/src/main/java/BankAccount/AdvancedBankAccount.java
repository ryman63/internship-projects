package BankAccount;

public class AdvancedBankAccount extends BankAccount
{

    private final double CASH_BACK = 0.01;

    public AdvancedBankAccount()
    {
        serviceFee = new Money(100);
        history = new StringBuilder();
    }

    @Override
    public String openingAccount(String fullName, String pinCode)
    {
        history.append("Тип счёта: продвинутый\n");
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
    protected void cashBackAdditional()
    {
        Money cashBackAmount = amount.multiply(CASH_BACK);
        if(cashBackAmount.countAllKopecks() > 100 * 100)
            cashBackAmount.setRublesAndKopecks(100, 0);
        super.amount = super.amount.Plus(cashBackAmount);

        if(cashBackAmount.countAllKopecks() > 0)
            operationDetalizing(new String("Начисление кэш-бэка в размере: " + cashBackAmount));
    }
}
