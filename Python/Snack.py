
import turtle

wn = turtle.Screen()
#wn.title("Drawing Geometric Shapes")
t = turtle.Turtle()
t.color('red', 'yellow')
t.speed(-100)

#=====================================

def star(x, y, length, angle):
    t.penup()
    t.goto(x, y)
    t.pendown()
    t.begin_fill()
    while True:
        t.forward(length)
        t.left(angle)
        if t.heading() == 0: #================
            break
    t.end_fill()

#   (  x,    y,  length, angle)
star(-470,  300,  10,    0)
star( 360,  320,  10,    160)
star(-450, -340,  10,    100)
star( 360, -340,  10,    170)
star(-200,  0,    400,    178)
t.penup()
t.goto(-100, 0)
