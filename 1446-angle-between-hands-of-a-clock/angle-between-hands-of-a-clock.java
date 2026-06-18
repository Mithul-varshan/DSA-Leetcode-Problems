class Solution {
    public double angleClock(int hour, int minutes) {
        if(hour == 12) hour = 0;
        double min = minutes * 6;
        double hr = (hour * 30) + (minutes * 0.5);
        double angle = Math.abs(hr - min);
        return Math.min(angle, 360 - angle);
    }
}