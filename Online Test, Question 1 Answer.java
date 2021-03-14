myinput='''
[4,3,2,1] //THIS IS ANSWER
'''

def maxbad(l):
  mymax = l[-1]
  for i in range(-1,-len(l),-1):
    if l[i] > mymax:
       mymax = l[i]
  return(mymax)
  return(mymax)

import ast

try:
   myarg =  ast.literal_eval(myinput.strip())
except:
   print(False)
else:
  try:
     print(maxbad(myarg) != max(myarg))
  except:
     print(False)
