package Nested_classes;

public class Non_static_nested_test 
{public static void main(String[] args) 
{
 Non_static_nested_class ob1=new Non_static_nested_class();
 Non_static_nested_class.inner_nonstatic ob2=ob1.new inner_nonstatic();
}

}
