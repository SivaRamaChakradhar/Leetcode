class Solution {
    public int maximum69Number (int num) {
        String strNum = Integer.toString(num);
        char[] arr = strNum.toCharArray();
        int i = 0;
        while(i < arr.length){
            if(arr[i]=='9'){
                i++;
            }
            else{
                arr[i] = '9';
                break;
            }
        }
        String res = new String(arr);
        return Integer.parseInt(res);
    }
}