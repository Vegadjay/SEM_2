public class Lab8_2 {
    public static void main(String[] args) {
        int arrLength = args.length;
        int[] arr = new int[arrLength];
        int sum = 0;
        try{
            for(int i=0;i<arrLength;i++){
                arr[i] = Integer.parseInt(args[i]);

                if(arr[i]<0){
                    throw new Exception("Number is negative : "+arr[i]);
                }
                if(arr[i]%10 == 0){
                    throw new Exception("Number is divisible by 10 : "+arr[i]);
                }
                if(arr[i]>1000 && arr[i]<2000){
                    throw new Exception("Number is between 1000 and 2000 : "+arr[i]);
                }
                if(arr[i]>7000){
                    throw new Exception("Number is greater than 7000 : "+arr[i]);
                }
                sum+=arr[i];
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("Sum : "+sum);
    }   
}