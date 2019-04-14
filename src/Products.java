import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 class Products {
    private static List<String> list_products = new ArrayList<>();
    private static StringBuilder products_builder = new StringBuilder();
    private static double money = 0;

     private static void getProducts() throws IOException {
         String token;
         Scanner inFile1 = new Scanner(new File("products\\products.txt"));
         while (inFile1.hasNextLine()) {
             token = inFile1.nextLine();
             list_products.add(token);
         }
         inFile1.close();
         for (String x : list_products) {
             System.out.println(list_products.indexOf(x)+1+": "+x);
         }
     }


      static String createList() throws  IOException
     {
         List<String> p_list = new ArrayList<>();
         Products.getProducts();
         Scanner product_id = new Scanner(System.in);
         String x;
         int real_x;
         System.out.println("Which product would you like to add?(End - stops)");
        for(;;)
        {
            System.out.print("\nProduct_number: ");
            x = product_id.nextLine();
            if(x.toLowerCase().equals("end")) { break; }
            real_x = Integer.parseInt(x) - 1;

            if(real_x >=list_products.size()|| real_x <0) {
                System.out.println("Product number out of range!\r\nTry Again");
                }
            else {p_list.add(list_products.get(real_x));}
        }
         for(String b : p_list)
         {
             products_builder.append(b);
             products_builder.append(" ");
         }

         String numbers = products_builder.toString().replaceAll("[^0-9]*[^0-9.]"," ");
         Scanner outer = new Scanner(numbers);

         while(outer.hasNext())
         {

             double num = Double.parseDouble(outer.next());
             money+=num;
         }

         return  products_builder+"\r\nTotal cash: "+money+ "$";

     }

}
