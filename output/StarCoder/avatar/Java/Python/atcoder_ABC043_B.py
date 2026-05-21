class BUnhappyHackingABCEdit:
    def solve(self, test_number, in_stream, out_stream):
        s = in_stream.readline().strip()
        d = []
        for c in s:
            if c == '0':
                d.append('0')
            elif c == '1':
                d.append('1')
            elif c == 'B':
                if d:
                    d.pop()
        out_stream.write(''.join(d))
        out_stream.write('\n')

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    b_unhappy_hacking_abce_edit = BUnhappyHackingABCEdit()
    b_unhappy_hacking_abce_edit.solve(1, input_stream, output_stream)
    output_stream.close()

if __name__ == "__main__":
    import sys
    main()