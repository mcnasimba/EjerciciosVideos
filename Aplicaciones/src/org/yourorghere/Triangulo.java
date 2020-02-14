/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yourorghere;

import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;

import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;
/**
 *
 * @author Usuario
 */
public class Triangulo {
    float angle=0;
    public GL gl;
    
    private float x,y;
    
    private float base, altura;
    
    private float rotx, roty;
    
    private float escx, escy;
    
    private float r,g,b;
    
    public Triangulo(GL gl, float x, float y, float base, float altura, float r, float g, float b){
        
        this.gl=gl;
        this.x=x;
        this.y=y;
        this.base=base;
        this.altura=altura;
        this.r=r;
        this.g=g;
        this.b=b;
        
    }
    
    public void draw(){
        
        gl.glPushMatrix();
        
        gl.glColor3f(r, g, b);
        gl.glRotatef(angle,0, 0, rotx);
        
        gl.glBegin(GL.GL_TRIANGLES);
        
        gl.glVertex2f(0, 0);
        gl.glVertex2f(base/2,altura);
        gl.glVertex2f(base, 0);
        
        gl.glEnd();
        
        gl.glPopMatrix();
        angle+=1;
        rotx+=1;
        roty+=1;
    }
    
}
