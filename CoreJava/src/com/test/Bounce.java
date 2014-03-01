package com.test;

import java.awt.*;
 import java.awt.event.*;
 import java.awt.geom.*;
import java.util.*;
 import javax.swing.*;

/**
If you carefully look over the code at the end of this section, you will notice
the call
canvas.paint(canvas.getGraphics())
inside the move method of the Ball class. That is pretty strange�
normally, you'd call repaint and let the AWT worry about getting the
graphics context and doing the painting. But if you try to call
canvas.repaint() in this program, you'll find out that the canvas is
never repainted since the addBall method has completely taken over all
processing. In the next program, where we use a separate thread to
compute the ball position, we'll again use the familiar repaint.
 Shows an animated bouncing ball.
 */
 public class Bounce
 {
 public static void main(String[] args)
 {
 JFrame frame = new BounceFrame();
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.show();
 }
 }

 /**
 The frame with canvas and buttons.
 */
 class BounceFrame extends JFrame
 {
 /**
 Constructs the frame with the canvas for showing th
 bouncing ball and Start and Close buttons
 */
 public BounceFrame()
 {
 setSize(WIDTH, HEIGHT);
 setTitle("Bounce");

 Container contentPane = getContentPane();
 canvas = new BallCanvas();
 contentPane.add(canvas, BorderLayout.CENTER);
 JPanel buttonPanel = new JPanel();
 addButton(buttonPanel, "Start",
 new ActionListener()
 {
 public void actionPerformed(ActionEvent ev)
 {
 addBall();
 }
 });

 addButton(buttonPanel, "Close",
 new ActionListener()
 {
 public void actionPerformed(ActionEvent ev)
 {
 System.exit(0);
 }
 });
 contentPane.add(buttonPanel, BorderLayout.SOUTH);
 }

 /**
 Adds a button to a container.
 @param c the container
 @param title the button title
 @param listener the action listener for the button
 */
 public void addButton(Container c, String title,
 ActionListener listener)
 {
 JButton button = new JButton(title);
 c.add(button);
 button.addActionListener(listener);
 }

 /**
 Adds a bouncing ball to the canvas and makes
 it bounce 1,000 times.
 */
 public void addBall()
 {
 try
 {
 Ball b = new Ball(canvas);
 canvas.add(b);
 for (int i = 1; i <= 1000; i++)
{
 b.move();
 Thread.sleep(5);
}
 }
 catch (InterruptedException exception)
 {
 }
 }

 private BallCanvas canvas;
 public static final int WIDTH = 450;
 public static final int HEIGHT = 350;
 }

 /**
 The canvas that draws the balls.
 */
 class BallCanvas extends JPanel
 {
 /**
 Add a ball to the canvas.
 @param b the ball to add
 */
 public void add(Ball b)
 {
 balls.add(b);
 }

 public void paintComponent(Graphics g)
 {
 super.paintComponent(g);
 Graphics2D g2 = (Graphics2D)g;
 for (int i = 0; i < balls.size(); i++)
 {
 Ball b = (Ball)balls.get(i);
 b.draw(g2);
 }
 }

 private ArrayList balls = new ArrayList();
 }

 /**
 A ball that moves and bounces off the edges of a
 component
 */
 class Ball
 {
 /**
 Constructs a ball in the upper left corner
 @c the component in which the ball bounces
 */
 public Ball(Component c) { canvas = c; }

 /**
 Draws the ball at its current position
 @param g2 the graphics context
 */
public void draw(Graphics2D g2)
 {
 g2.fill(new Ellipse2D.Double(x, y, XSIZE, YSIZE));
 }

 /**
 Moves the ball to the next position, reversing dire
 if it hits one of the edges
 */
 public void move()
 {
 x += dx;
 y += dy;
 if (x < 0)
 {
 x = 0;
 dx = -dx;
 }
 if (x + XSIZE >= canvas.getWidth())
 {
 x = canvas.getWidth() - XSIZE;
 dx = -dx;
 }
 if (y < 0)
 {
 y = 0;
 dy = -dy;
 }
 if (y + YSIZE >= canvas.getHeight())
 {
 y = canvas.getHeight() - YSIZE;
 dy = -dy;
 }

 canvas.paint(canvas.getGraphics());
 }

 private Component canvas;
 private static final int XSIZE = 15;
 private static final int YSIZE = 15;
 private int x = 0;
 private int y = 0;
 private int dx = 2;
 private int dy = 2;
 }
