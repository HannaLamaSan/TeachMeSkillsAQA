package Employee;

public class Worker implements Employee
{
    private String position = "Worker";
    @Override
    public String getPositions() {
        return position;
    }
}
