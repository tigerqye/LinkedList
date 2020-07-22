/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylinkedlist;

/**
 *
 * @author tigerye
 */
public class Node {
        
        private Integer value;
        private Node next;

        public Node(Integer value) {    
                this.value = value;
                this.next = null;
        }

        public int getValue() {
                return value;   
        }

        public Node getNext() {
                return next;
        }

        public void setValue(Integer value) {   
                this.value = value;     
        }

        public void setNext(Node next) {        
                this.next = next;
        }
}
