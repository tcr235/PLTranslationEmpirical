def atcoder_AGC028_A ( n , m , s , t ) :

gcd = math.gcd ( n , m )

if s == t :

return - 1

else :

return any ( k -> s [ k * n // gcd ] != t [ k * m // gcd ] ) ( range ( 0 , gcd ) )
