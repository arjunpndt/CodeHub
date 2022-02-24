class Solution {
    public int romanToInt(String s) {
        
        int sum  = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'M'){
                sum = sum + 1000;
                if(i>0 && s.charAt(i-1)=='C'){
                    sum = sum-200;
                }
                continue;
            }
            if(ch == 'D'){
                sum = sum + 500;
                if(i>0 && s.charAt(i-1)=='C'){
                    sum = sum-200;
                }
                continue;
            }
            if(ch == 'C'){
                sum = sum + 100;
                if(i>0 && s.charAt(i-1)=='X'){
                    sum = sum-20;
                }
                continue;
            }
            if(ch == 'L'){
                sum = sum + 50;
                if(i>0 && s.charAt(i-1)=='X'){
                    sum = sum-20;
                }
                continue;
            }
            if(ch == 'X'){
                sum = sum + 10;
                if(i>0 && s.charAt(i-1)=='I'){
                    sum = sum-2;
                }
                continue;
            }
            if(ch == 'V'){
                sum = sum + 5;
                if(i>0 && s.charAt(i-1)=='I'){
                    sum = sum-2;
                }
                continue;
            }
            if(ch == 'I'){
                sum = sum + 1;
            }
            continue;
        }

        return sum;
    
    }
}