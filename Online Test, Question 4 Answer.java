def decreasing(l):
  if l==[] or len(l) == 1:
    return(True)
  else:
    return(
       # Complete the recursive call below this line
           l[0] > l[1] and decreasing(l[1:])
       # Complete the recursive call above this line
    )

import ast

def tolist(inp):
  inp = ast.literal_eval(inp)
  return(inp)

fncall = input()
lparen = fncall.find("(")
rparen = fncall.rfind(")")
fname = fncall[:lparen]
farg = fncall[lparen+1:rparen]

if fname == "decreasing":
  arg = tolist(farg)
  print(decreasing(arg))
