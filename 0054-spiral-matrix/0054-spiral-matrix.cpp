class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        
        vector<int> ans;

        int startingRow = 0;
        int endingRow = matrix.size() - 1;

        int startingCol = 0;
        int endingCol = matrix[0].size() - 1;

        int total = matrix.size() * matrix[0].size();
        int count = 0;

        while (count < total) {

            // 1. Left -> Right
            for (int index = startingCol; 
                 index <= endingCol && count < total; 
                 index++) {

                ans.push_back(matrix[startingRow][index]);
                count++;
            }
            startingRow++;


            // 2. Top -> Bottom
            for (int index = startingRow; 
                 index <= endingRow && count < total; 
                 index++) {

                ans.push_back(matrix[index][endingCol]);
                count++;
            }
            endingCol--;


            // 3. Right -> Left
            for (int index = endingCol; 
                 index >= startingCol && count < total; 
                 index--) {

                ans.push_back(matrix[endingRow][index]);
                count++;
            }
            endingRow--;


            // 4. Bottom -> Top
            for (int index = endingRow; 
                 index >= startingRow && count < total; 
                 index--) {

                ans.push_back(matrix[index][startingCol]);
                count++;
            }
            startingCol++;
        }

        return ans;
    }
};