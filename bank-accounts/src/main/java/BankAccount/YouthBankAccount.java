package BankAccount;

public class YouthBankAccount extends BankAccount
{
    int countPayment;
    public final Money  FINE = new Money(300);
    private final double CASH_BACK = 0.02;

    public YouthBankAccount()
    {
        commission = new Money(10);
        history = new StringBuilder();
    }

    @Override
    public String openingAccount(String fullName, String pinCode)
    {
        history.append("Тип счёта: молодёжный\n");
        return super.openingAccount(fullName, pinCode);
    }

    @Override
    protected void serviceFeePayment()
    {
        // выплат за обслуживание нет
    }

    @Override
    protected void cashBackAdditional()
    {
        Money cashBackAmount = amount.multiply(CASH_BACK);
        super.amount = super.amount.Plus(cashBackAmount);
        if(cashBackAmount.countAllKopecks() > 0)
            operationDetalizing(new String("Начисление кэш-бэка в размере: " + cashBackAmount));
    }

    @Override
    public boolean payment(String pinCode, Money amount, String src)
    {
        boolean result = super.payment(pinCode, amount, src);
        if(result)
        {
            countPayment++;
        }
        return result;
    }



    @Override
    public void increaseCountMonth()
    {

        // если оплат за месяц было 0, то штрафуем
        if(countPayment == 0)
        {
            fineSum = fineSum.Plus(FINE);
            fineAdditional();
        }

        // обнуляем счётчик как только закончился месяц
        countPayment = 0;

        super.increaseCountMonth();
    }
}
