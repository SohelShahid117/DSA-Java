//DSA Home & Introduction:https://www.w3schools.com/dsa/index.php
class dsaHomeIntro{
    public static void main(String[] args) {
        // System.out.println("hello world");

        int[] myArray = {1,2,3,4,66,71,-5};
        int minVal = myArray[0];
        for(int i:myArray){
            if(i<minVal){
                minVal=i;
            }
        }
        System.out.println(minVal);

    }
}