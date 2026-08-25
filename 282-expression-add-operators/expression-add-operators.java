class Solution {    
    public List<String> addOperators(String num, int target) {
        List<String> result = new ArrayList<>();
        solve(num, target, 0, "", 0, 0, result);
        return result;
    }
    private void solve(String num, int target, int index,
                       String expression, long value,
                       long previous, List<String> result) {
        if (index == num.length()) {
            if (value == target) {
                result.add(expression);
            }
            return;
        }  
        for (int i = index; i < num.length(); i++) {
            if (i > index && num.charAt(index) == '0') {
                break;
            }
            String currentStr = num.substring(index, i + 1);
            long current = Long.parseLong(currentStr);
            if (index == 0) { 
                solve(num, target, i + 1,
                      currentStr,
                      current,
                      current,
                      result);
            } 
            else {
                solve(num, target, i + 1,
                      expression + "+" + currentStr,
                      value + current,
                      current,
                      result);

                solve(num, target, i + 1,
                      expression + "-" + currentStr,
                      value - current,
                      -current,
                      result);

                solve(num, target, i + 1,
                      expression + "*" + currentStr,
                      value - previous + previous * current,
                      previous * current,
                      result);
            }
        }
    }
}