// Method Throwing  an exception

class MethodException
{
    void m()
    {
        int a[] = null ;
        a[5] = 4;
    }

    public static void main(String[] args) {
        MethodException obj = new MethodException();
        try 
        {
            obj.m();
        }
        catch(NullPointerException ae)
        {
             System.out.println("Memory is null ");
        }
    }
}
