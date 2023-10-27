package Day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ProductImp {
    public static void main(String[] args) {
        List<Product> prdList=new ArrayList<Product>();
        prdList.add(new Product("TV","Electronic",23000.0,5));
        prdList.add(new Product("sugar","grocery",60,10));
        prdList.add(new Product("sofas","Furniture",15000,4));
        prdList.add(new Product("AC","Electrical",27000.0,2));
        prdList.add(new Product("mobile","Electronic",10000.0,10));
        List<Product>  prdElectronic=new ArrayList<Product>();
        for(Product p:prdList)
        {
          if(p.getCategory().equals("Electronic"))
          {
             prdElectronic.add(p);
          }
        }
        prdElectronic.forEach(p-> System.out.println(p));

       List<Product> prdE =prdList.stream().filter(p->p.getCategory().equals("Electronic")).collect(Collectors.toList());
       prdE.forEach(p-> System.out.println(p));

       prdList.stream().filter(p->p.getQty()>5 && p.getCategory().equals("Electronic")).collect(Collectors.toList()).forEach(p-> System.out.println(p.getName()));
      // prdQtyMore5.forEach(p1-> System.out.println(p1));

       List<String> prdNames=prdList.stream().filter(p->p.getCategory().equals("Electronic")).map(p->p.getName()).collect(Collectors.toList());
       prdNames.forEach(p-> System.out.println(p));

       Set<Double> priceL=prdList.stream().map(p->p.getPrice()).collect(Collectors.toSet());
       priceL.forEach(pr-> System.out.println(pr));
       double totaPrice=0;
       for(Product p:prdList)
       {
          totaPrice+=p.getPrice();
       }
        System.out.println(totaPrice);
     double total=prdList.stream().map(p->p.getPrice()).reduce(0.0,(sum,price)-> sum+price);
        System.out.println(total);
        int totaQ=prdList.stream().map(p->p.getQty()).reduce(0,(s,q)->s+q);
        System.out.println(totaQ);

        int qty=prdList.stream().filter(p->p.getCategory().equals("Electronic")).map(p1->p1.getQty()).reduce(0,(s,q)->s+q);
        System.out.println(qty);


        double priceT=prdList.stream().collect(Collectors.summingDouble(p->p.getPrice()));
        System.out.println(priceT);
    }
}

// get me the total qty of all the products name starting with "s"
