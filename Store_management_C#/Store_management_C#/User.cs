public class User
{
    protected int userId;
    protected string userName;
    protected string phone;

    public User(int userId, string userName, string phone)
    {
        this.userId = userId;
        this.userName = userName;
        this.phone = phone;
    }

    public int GetUserId()
    {
        return userId;
    }

    public string GetUserName()
    {
        return userName;
    }

    public string GetPhone()
    {
        return phone;
    }

    public virtual void DisplayUser()
    {
        Console.WriteLine("User ID   : " + userId);
        Console.WriteLine("User Name : " + userName);
        Console.WriteLine("Phone     : " + phone);
    }

    public virtual void ShowRole()
    {
        Console.WriteLine("Role: User");
    }
}