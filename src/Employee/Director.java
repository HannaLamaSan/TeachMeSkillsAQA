package Employee;

public class Director implements Employee
{
    private String position = "Director";
    @Override
    public String getPositions()
    {
        return position;
    }
}
