/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;
import com.sun.opengl.util.GLUT;
import javax.media.opengl.GLCanvas;
import com.sun.opengl.util.Animator;
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
public class Casa3D {
    
    public GLUT glut;
    public GLU glu;
    public GL gl;
    private float tamanio;
    private float r;
    private float g;
    private float b; 
    private float posicion[]= new float[3];

    public Casa3D(GLUT glut, GL gl, float tamanio, float r, float g, float b, float[] posicion) {
        this.glut = glut;
        this.gl = gl;
        this.glu=glu;
        this.tamanio = tamanio;
        this.r = r;
        this.g = g;
        this.b = b;
        this.posicion = posicion;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public float getG() {
        return g;
    }

    public void setG(float g) {
        this.g = g;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float[] getPosicion() {
        return posicion;
    }

    public void setPosicion(float[] posicion) {
        this.posicion = posicion;
    }
    
    public void draw(){
        
        gl.glPushMatrix();
        glut.glutSolidCube(tamanio);
        gl.glTranslatef(0, tamanio, 0);
        gl.glPopMatrix();
        
    }
}
