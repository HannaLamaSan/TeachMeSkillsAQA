package Employee;

public class Accountant implements Employee
{
    private String position = "Accountant";
    @Override
    public String getPositions()
    {
        return position;
    }
}
