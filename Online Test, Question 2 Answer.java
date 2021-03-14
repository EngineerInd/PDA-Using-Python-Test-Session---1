myinput='''
[1,2,3,4,4] //THIS IS ANSWER
'''

def quicksortbad(l):
  if len(l) < 2:
    return(l)
  else:
    pivot = l[0]
    smaller = [l[j] for j in range(1,len(l)) if l[j] < pivot]
    bigger = [l[j] for j in range(1,len(l)) if l[j] > pivot]
    rearrange = quicksortbad(smaller) + [pivot] + quicksortbad(bigger)
    return(rearrange)
    
def quicksortgood(l):
  if len(l) < 2:
    return(l)
  else:
    pivot = l[0]
    smaller = [l[j] for j in range(1,len(l)) if l[j] <= pivot]
    bigger = [l[j] for j in range(1,len(l)) if l[j] > pivot]
    rearrange = quicksortgood(smaller) + [pivot] + quicksortgood(bigger)
    return(rearrange)
    
import ast

try:
   myarg =  ast.literal_eval(myinput.strip())
except:
   print(False)
else:
  try:
     print(quicksortbad(myarg) != quicksortgood(myarg))
  except:
     print(False)
