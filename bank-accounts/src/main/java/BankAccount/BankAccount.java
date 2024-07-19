package BankAccount;
public abstract class BankAccount
{
    private String memberFullName;
    protected Money amount = new Money();
    private int countMonth;
    protected Money serviceFee = new Money();
    protected Money commission = new Money();

    protected Money fineSum = new Money();
    protected StringBuilder history;
    private int pinHashCode;
    private boolean isOpen = false;

    protected boolean checkPinCode(String pinCode)
    {
        if(pinCode.hashCode() == pinHashCode)
            return true;

        return false;
    }

    protected boolean checkAmount(Money amount)
    {
        if(this.amount.Minus(amount) != null)
            return true;

        return false;
    }

    protected void fineAdditional()
    {
        Money result = amount.Minus(fineSum);
        if(result == null)
        {
            fineSum = fineSum.Minus(amount);
            amount.setToZero();
        }
        else
        {
            amount.Equate(result);
            fineSum.setToZero();
        }
    }

    protected void operationDetalizing(String... details)
    {
        history.append("Месяц: " + countMonth
                + " - "
        );

        for(String item : details)
            history.append(item);

        history.append("\n\n");
    }

    public String getMemberFullName() {
        return memberFullName;
    }

    // открытие счёта
    public String openingAccount(String fullName, String pinCode)
    {
        memberFullName = fullName;
        pinHashCode = pinCode.hashCode();
        isOpen = true;
        return "Открытие счёта на: " + fullName + "\n";
    }

    // проверка открыт ли счёт
    public boolean isAccountOpening() { return isOpen; }

    // пополнение денег на счёт
    public boolean putMoney(String pinCode, Money amount)
    {

        if(isOpen && checkPinCode(pinCode))
        {
            this.amount = this.amount.Plus(amount);
            operationDetalizing(new String("Операция: пополнение, на сумму = " + amount));

            // вычеты за штраф
            if(fineSum.countAllKopecks() > 0)
                fineAdditional();
            return true;
        }

        return false;
    }

    // снятие денег со счёта
    public Money withdrawMoney(String pinCode, Money amount)
    {
        Money sumWithCommission = amount.Minus(commission);
        if(isOpen && checkPinCode(pinCode) && checkAmount(sumWithCommission))
        {
            this.amount = this.amount.Minus(sumWithCommission);
            operationDetalizing(new String("Операция: снятие, на сумму = " + amount),
                    new String(" Комиссия: " + commission));
            return amount;
        }
        return null;
    }

    public boolean payment(String pinCode, Money amount, String src)
    {
        if(isOpen && checkPinCode(pinCode) && checkAmount(amount))
        {
            this.amount = this.amount.Minus(amount);
            operationDetalizing(new String("Операция: оплата, на сумму = " + amount),
                    new String(" Кому: " + src));

            cashBackAdditional();

            return true;
        }


        return false;
    }

    public Money getAmount() {
        return amount;
    }

    public String getHistory() {
        return history.toString();
    }

    public String getOwnerInfo()
    {
        return  "ФиО: " + memberFullName + ", баланс: " + amount + ", ваша задолжность: " + fineSum;
    }

    // выплата за обслуживание
    protected abstract void serviceFeePayment();

    // прибавка кэшбэка
    protected abstract void cashBackAdditional();

    public void increaseCountMonth()
    {
        if(isOpen)
        {
            countMonth++;
            serviceFeePayment();
        }
    }
}
