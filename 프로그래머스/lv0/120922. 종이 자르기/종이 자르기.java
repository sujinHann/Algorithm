class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        int width = M - 1;
        int height = M * (N - 1);
        answer = width + height;
        return answer;
    }
}