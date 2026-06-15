def atcoder_ABC123_B (): # a, r, map = [ ], [ ], {} for i in range (5): a.append (input ()) r.append (a [i] % 10) if r [i] != 0: map.update ({10 - r [i] : a [i]}) if map: last = map.values () [0] idx = 0 for i in range (5): if a [i] == last: idx = i for i in range (5): if i != idx: if a [i] % 10 == 0: ans += a [i] else: ans += a [i] + (10 - r [i]) ans += last return ans print (ans)

