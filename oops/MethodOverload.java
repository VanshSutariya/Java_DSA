
class MethodOverload
{
    int area(int l){
        return l*l;
    }
    int area(int l,int b){
        return(l*b);
    }
    public static void main (String arg[])
    {
        MethodOverload m = new MethodOverload();
        System.out.println(" Area of Square:"+ m.area(8));
        System.out.println(" Area of rectangle:"+ m.area(8,5));

    }
} 