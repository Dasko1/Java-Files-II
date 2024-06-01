package files;

class SumReturn {

    private final int a;

    public SumReturn(int i)
        {
            a = i;
        }

        /*The addition method returns a SumReturn object with adding 100 into it. */
        public SumReturn addition()
        {
            SumReturn result = new SumReturn(a + 100);

            return result;
        }

        public void display()
        {
            System.out.println("Addition result: " + a);
        }
    }

    public class ReturnClass
    {
        /* Driver Code */
        public static void main(String[] args)
        {
            SumReturn obj1 = new SumReturn(50);
            SumReturn obj2;
            /* addition method returns a reference of SumResult class */
            obj2 = obj1.addition();
            obj2.display();
        }
    }
