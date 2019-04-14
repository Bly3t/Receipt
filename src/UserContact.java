import java.io.PrintWriter;

 class UserContact {


   private String  firstName;
   private  String surName;


      UserContact(String firstName, String surName)
    {
        this.firstName = firstName;
        this.surName = surName;
    }

    private String getFirstName(){return firstName;}
    private String getSurName(){return surName;}
    private void setFirstName(String firstName){ this.firstName = firstName;}
    private void setSurName(String surName){this.surName = surName;}


    private String getInfo()  // gives info to method getRecipe
    {
        return ("Name: "+firstName+
                "\r\nSurname: "+surName);
    }

      void getRecipe(UserContact user)
    {
        try(PrintWriter out = new PrintWriter("receipt.txt"))
        {
            out.println(user.getInfo() + "\r\nCart: "+ Products.createList()); // saves string into txt
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }

}
