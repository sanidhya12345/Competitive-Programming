class Solution:
    def checkUnique(self, l):
        filtered = [x for x in l if x != '.']  # Exclude dots
        return len(set(filtered)) == len(filtered)

    def isValidSudoku(self, board: List[List[str]]) -> bool:
        # Check rows
        crow = 0
        for i in range(9):
            row = [board[i][j] for j in range(9)]
            if self.checkUnique(row):
                crow += 1

        # Check columns
        ccol = 0
        for i in range(9):
            col = [board[j][i] for j in range(9)]
            if self.checkUnique(col):
                ccol += 1

        # Check 3x3 sub-grids
        cmat = 0
        for grid_row in range(0, 9, 3):
            for grid_col in range(0, 9, 3):
                sub_grid = []
                for i in range(grid_row, grid_row + 3):
                    for j in range(grid_col, grid_col + 3):
                        sub_grid.append(board[i][j])
                if self.checkUnique(sub_grid):
                    cmat += 1

        # Validate rows, columns, and sub-grids
        return crow == 9 and ccol == 9 and cmat == 9
