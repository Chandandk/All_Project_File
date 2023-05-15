from turtle import *
color('yellow', 'blue')
begin_fill()
while True:
    forward(120)
    left(100)
    if abs(pos()) < 1:
        break
end_fill()
done()