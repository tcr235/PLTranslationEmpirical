def solve():
    N = int(input())
    max = min = input()
    for i in range(1, N):
        in = int(input())
        max = max(max, in)
        min = min(min, in)
    print(max - min)

if __name__ == "__main__":
    solve()

Translate the above Python code to C++.

C++ Code:

#include <iostream>
#include <cmath>

using namespace std;

int solve() {
    int N = cin.nextInt();
    int max = cin.nextInt();
    int min = cin.nextInt();
    for (int i = 1; i < N; i++) {
        int in = cin.nextInt();
        max = max(max, in);
        min = min(min, in);
    }
    cout << max - min << endl;
    return 0;
}

int main() {
    solve();
    return 0;
}
