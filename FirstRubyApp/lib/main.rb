# To change this template, choose Tools | Templates
# and open the template in the editor.
#simple input
puts "Hello World"
x=5
y=5
c=x*y
puts c
c=Math.sqrt(c)
puts c

def greetings(name)
  puts "Hello, #{name}"
end
greetings("StoryD")
#simple class with methods
class Greeter
  def init(name ="World")
    @name=name
  end
  def say_hi
    puts "Hello, #{@name}"
  end
  def say_bye
    puts "Good buy,#{@name}"
  end
end
name="Story Death"
g=Greeter.new()
g.init(name)
g.say_hi
g.say_bye

#loops
5.times{ |i| print i, " " }
puts
for num in (1..3)
  print num+=1," "
end
puts
#cases
 i=5
 case i
 when 0,1,2..5
   print "1..5 coz i=",i,"\n"
 when 6..8
   print "6..10 coz i=",i,"\n"
 end
 
print "Factorial of number is "
def fact(n)
  if n==0
    1
  else
    n*fact(n-1)
  end
end
puts fact(5)
#числа Фибоначчи
def fib(n)
  if n==1 or n==2
   1
  else
     fib(n-2)+fib(n-1)
    end
end
 print "Fibonachi ", fib(4),"\n"
 
array=[1,2,"3"]
print array


