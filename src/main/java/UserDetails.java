import org.json.simple.JSONObject;

public class UserDetails {


    private String name;
    private String email;
    private int age;

    JSONObject user = new JSONObject();

    public UserDetails(String name, String email, int age){

        this.name = name;
        this.email = email;
        this.age = age;

        user.put("name","abdi");
        user.put("email","dahmid@email.com");
        user.put("age",25);

    }

    public void PrintUserDetails(){

        System.out.println(user);

    }
}
