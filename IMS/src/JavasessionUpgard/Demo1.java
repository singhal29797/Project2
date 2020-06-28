package JavasessionUpgard;

class Demo1{
    public void print(int n){
        for(int i = 0; i < n*n; i++) {
            for(int j = 0; j < n/2; j += 2) {
                System.out.println("Hello World!");
            }
        }
    }
    public static void main(String[] args){
        Demo1 obj = new Demo1();
        obj.print(5);
    }


}
