class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> r = new ArrayList<>(numRows);
        List<Integer> row, n=null;
        
        for(int i= 0; i< numRows;++i){
            row=new ArrayList<Integer>();
            for(int j=0;j<=i;++j)
                if(j==0 || j==i)
                    row.add(1);
                else
                    row.add(n.get(j-1)+n.get(j));
              n=row;            
              r.add(row);
            
        }
        return r;
    }
}