/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import com.sun.opengl.util.GLUT;
import javax.media.opengl.GLCanvas;
import com.sun.opengl.util.Animator;
import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.swing.JFrame;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

/**
 *
 * @author Usuario
 */
public class Prueba implements GLEventListener {

    Triangulo triangulo;
    GLUT glut;
    GLU glu;
    float move;
    float rot;
    FloatBuffer ctrlpoints[][];


    public Prueba() {

        JFrame ventana = new JFrame("Mi Primera aplicacion OpenGL");
        ventana.setSize(480, 400);

        GLCanvas canvas = new GLCanvas();

        canvas.addGLEventListener(this);
        ventana.add(canvas);

        final Animator animator = new Animator(canvas);

        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);

        animator.start();

        ventana.setResizable(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvas.requestFocusInWindow();

    }

    public static void main(String args[]) {

        Prueba fig = new Prueba();

    }

    public void init(GLAutoDrawable drawable) {

        GL gl = drawable.getGL();
        glut = new GLUT();
        glu = new GLU();
        move = 0;
        rot = 0;
        gl.glClearColor(0, 1, 1, 0);
        this.triangulo = new Triangulo(gl, 0, 0, 1, 1, 0, 0, 1);
        
    }

    public void display(GLAutoDrawable drawable) {

        //error
        GL gl = drawable.getGL();
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        gl.glLoadIdentity();
        gl.glRotatef(45, 1, -0.5f, 1);
       
        /*gl.glRotatef(45, 1, -0.5f, 1);
        gl.glRotatef(25, 1, 0, 0);
        
        gl.glPushMatrix();
        gl.glTranslatef(-0.5f, 0, 0);
        gl.glColor3f(0.5f, 0.5f, 0);
        glut.glutSolidCube(0.5f);
        gl.glPopMatrix();
        
        
        gl.glPushMatrix();
        gl.glRotatef(rot,1,1,1);
        gl.glTranslatef(0.5f,0.1f,0);
        //glut.glutSolidCone(0.25f, 0.5f, 16, 16);
        glu.
        gl.glPopMatrix();
        
        move +=0.0001;
        rot+=0.1;
        System.out.println(move);
        //triangulo.draw();
        /*gl.glColor3f(0, 0, 1);
        gl.glBegin(GL.GL_QUADS);
        gl.glVertex2f(0, 0);
        gl.glVertex2f(0,0.5f);
        gl.glVertex2f(0.5f, 0.5f);
        gl.glVertex2f(0.5f,0);
        
        gl.glEnd();*/

        //gl.glTranslatef(-0.25f, -0.25f, -0.1f);
        
        glu.gluLookAt(0.5f, 0, 1, 0, 0, 1, 0, 1, 0);
        
        gl.glColor3f(0.1f, 0.5f, 0.8f);
        glut.glutSolidCube(1);
        
       // gl.glTranslatef(0.0f, 0.0f, 0.5f);
        gl.glRotatef(270, 1, 0, 0);
        gl.glPushMatrix();
        gl.glBegin(gl.GL_QUADS);
        gl.glColor3f(1f, 0.5f, 0.2f);
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(0.0f, 0.0f, 1.0f);
        gl.glVertex3f(1.0f, 0.0f, 1.0f);
        gl.glVertex3f(1.0f, 0.0f, 0.0f);
        gl.glEnd();

        gl.glBegin(GL.GL_TRIANGLES);
        gl.glColor3f(0.1f, 0.8f, 0.1f);
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(0.5f, 1.5f, 0.5f);
        gl.glVertex3f(1.0f, 0.0f, 0.0f);
        gl.glEnd();

        gl.glBegin(GL.GL_TRIANGLES);
        gl.glColor3f(0.6f, 0.8f, 0.1f);
        gl.glVertex3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(0.5f, 1.5f, 0.5f);
        gl.glVertex3f(1.0f, 0.0f, 1.0f);
        gl.glEnd();

        gl.glBegin(GL.GL_TRIANGLES);
        gl.glColor3f(0.6f, 0.8f, 0.6f);
        gl.glVertex3f(1.0f, 0.0f, 1.0f);
        gl.glVertex3f(0.5f, 1.5f, 0.5f);
        gl.glVertex3f(0.0f, 0.0f, 1.0f);
        gl.glEnd();
        
         gl.glBegin(GL.GL_TRIANGLES);
        gl.glColor3f(0.2f, 0.3f, 0.6f);
        gl.glVertex3f(0.0f, 0.0f, 1.0f);
        gl.glVertex3f(0.5f, 1.5f, 0.5f);
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glEnd();

        gl.glPopMatrix();
        gl.glFlush();
        move += 0.01;
        rot+=0.01;

    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {

        GL gl = drawable.getGL();
        float ar = (float) width / (float) height;

        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();

        //gl.glFrustum(ar, -ar, -1, 1, 1, 1);

        glu.gluPerspective(0, 0, 100, -100);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();

    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
