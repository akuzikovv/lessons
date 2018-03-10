//package Lesson11;
//
//import javax.xml.soap.Node;
//import java.util.*;
//
//public class CustomList1<T> implements List<T>, Deque<T> {
//
//    private T Node first;
//    private T Node last;
//
//    private int size;
//    /**
//     * Inserts the specified element at the front of this deque if it is
//     * possible to do so immediately without violating capacity restrictions,
//     * throwing an {@code IllegalStateException} if no space is currently
//     * available.  When using a capacity-restricted deque, it is generally
//     * preferable to use method {@link #offerFirst}.
//     *
//     * @param t the element to add
//     * @throws IllegalStateException    if the element cannot be added at this
//     *                                  time due to capacity restrictions
//     * @throws ClassCastException       if the class of the specified element
//     *                                  prevents it from being added to this deque
//     * @throws NullPointerException     if the specified element is null and this
//     *                                  deque does not permit null elements
//     * @throws IllegalArgumentException if some property of the specified
//     *                                  element prevents it from being added to this deque
//     */
//    @Override
//    public void addFirst(T t) {
//        this.first = new Node(t, this.first, null);
//        size++;
//    }
//
//    /**
//     * Inserts the specified element at the end of this deque if it is
//     * possible to do so immediately without violating capacity restrictions,
//     * throwing an {@code IllegalStateException} if no space is currently
//     * available.  When using a capacity-restricted deque, it is generally
//     * preferable to use method {@link #offerLast}.
//     * <p>
//     * <p>This method is equivalent to {@link #add}.
//     *
//     * @param t the element to add
//     * @throws IllegalStateException    if the element cannot be added at this
//     *                                  time due to capacity restrictions
//     * @throws ClassCastException       if the class of the specified element
//     *                                  prevents it from being added to this deque
//     * @throws NullPointerException     if the specified element is null and this
//     *                                  deque does not permit null elements
//     * @throws IllegalArgumentException if some property of the specified
//     *                                  element prevents it from being added to this deque
//     */
//    @Override
//    public void addLast(T t) {
//        this.last = new Node(t, null, this.last);
//        size++;
//    }
//
//    /**
//     * Inserts the specified element at the front of this deque unless it would
//     * violate capacity restrictions.  When using a capacity-restricted deque,
//     * this method is generally preferable to the {@link #addFirst} method,
//     * which can fail to insert an element only by throwing an exception.
//     *
//     * @param t the element to add
//     * @return {@code true} if the element was added to this deque, else
//     * {@code false}
//     * @throws ClassCastException       if the class of the specified element
//     *                                  prevents it from being added to this deque
//     * @throws NullPointerException     if the specified element is null and this
//     *                                  deque does not permit null elements
//     * @throws IllegalArgumentException if some property of the specified
//     *                                  element prevents it from being added to this deque
//     */
//    @Override
//    public boolean offerFirst(T t) {
//        try {
//            addFirst(t);
//            return true;
//        } catch (RuntimeException e) {
//            return false;
//        }
//    }
//
//    /**
//     * Inserts the specified element at the end of this deque unless it would
//     * violate capacity restrictions.  When using a capacity-restricted deque,
//     * this method is generally preferable to the {@link #addLast} method,
//     * which can fail to insert an element only by throwing an exception.
//     *
//     * @param t the element to add
//     * @return {@code true} if the element was added to this deque, else
//     * {@code false}
//     * @throws ClassCastException       if the class of the specified element
//     *                                  prevents it from being added to this deque
//     * @throws NullPointerException     if the specified element is null and this
//     *                                  deque does not permit null elements
//     * @throws IllegalArgumentException if some property of the specified
//     *                                  element prevents it from being added to this deque
//     */
//    @Override
//    public boolean offerLast(T t) {
//        try {
//            addLast(t);
//            return true;
//        } catch (RuntimeException e) {
//            return false;
//        }
//    }
//
//    /**
//     * Retrieves and removes the first element of this deque.  This method
//     * differs from {@link #pollFirst pollFirst} only in that it throws an
//     * exception if this deque is empty.
//     *
//     * @return the head of this deque
//     * @throws NoSuchElementException if this deque is empty
//     */
//    @Override
//    public T removeFirst() {
//        T firstObject = pollFirst();
//        if (firstObject==null){
//              throw new NoSuchElementException("this deque is empty");
//        }
//        else return firstObject;
//
//    }
//
//    /**
//     * Retrieves and removes the last element of this deque.  This method
//     * differs from {@link #pollLast pollLast} only in that it throws an
//     * exception if this deque is empty.
//     *
//     * @return the tail of this deque
//     * @throws NoSuchElementException if this deque is empty
//     */
//    @Override
//    public T removeLast() {
//        T lastObject = pollLast();
//        if (lastObject==null){
//            throw new NoSuchElementException("this deque is empty");
//        }
//        else return lastObject;
//    }
//
//    /**
//     * Retrieves and removes the first element of this deque,
//     * or returns {@code null} if this deque is empty.
//     *
//     * @return the head of this deque, or {@code null} if this deque is empty
//     */
//    @Override
//    public T pollFirst() {
//        if (size<0){
//            Node firstNode = this.first;
//            this.first = this.first.next;
//            this.first.previous = null;
//            size--;
//
//            return firstNode.currentObject;
//        }else return null;
//    }
//
//    /**
//     * Retrieves and removes the last element of this deque,
//     * or returns {@code null} if this deque is empty.
//     *
//     * @return the tail of this deque, or {@code null} if this deque is empty
//     */
//    @Override
//    public T pollLast() {
//        if (size<0){
//            Node lastNode = this.last;
//            this.last = this.last.next;
//            this.last.next = null;
//            size--;
//            return lastNode.currentObject;
//        }else return null;
//    }
//
//    /**
//     * Retrieves, but does not remove, the first element of this deque.
//     * <p>
//     * This method differs from {@link #peekFirst peekFirst} only in that it
//     * throws an exception if this deque is empty.
//     *
//     * @return the head of this deque
//     * @throws NoSuchElementException if this deque is empty
//     */
//    @Override
//    public T getFirst() {
//        T firstObject = peekFirst();
//        if (firstObject==null){
//            throw new NoSuchElementException("this deque is empty");
//        }return firstObject;
//    }
//
//    /**
//     * Retrieves, but does not remove, the last element of this deque.
//     * This method differs from {@link #peekLast peekLast} only in that it
//     * throws an exception if this deque is empty.
//     *
//     * @return the tail of this deque
//     * @throws NoSuchElementException if this deque is empty
//     */
//    @Override
//    public T getLast() {
//        T lastObject = peekFirst();
//        if (lastObject==null){
//            throw new NoSuchElementException("this deque is empty");
//        }return lastObject;
//
//    }
//
//    /**
//     * Retrieves, but does not remove, the first element of this deque,
//     * or returns {@code null} if this deque is empty.
//     *
//     * @return the head of this deque, or {@code null} if this deque is empty
//     */
//    @Override
//    public T peekFirst() {
//        return (size>0)? this.first.currentObject: null;
//    }
//
//    /**
//     * Retrieves, but does not remove, the last element of this deque,
//     * or returns {@code null} if this deque is empty.
//     *
//     * @return the tail of this deque, or {@code null} if this deque is empty
//     */
//    @Override
//    public T peekLast() {
//        return (size>0)? this.last.currentObject: null;
//    }
//
//    /**
//     * Removes the first occurrence of the specified element from this deque.
//     * If the deque does not contain the element, it is unchanged.
//     * More formally, removes the first element {@code e} such that
//     * <tt>(o==null&nbsp;?&nbsp;e==null&nbsp;:&nbsp;o.equals(e))</tt>
//     * (if such an element exists).
//     * Returns {@code true} if this deque contained the specified element
//     * (or equivalently, if this deque changed as a result of the call).
//     *
//     * @param o element to be removed from this deque, if present
//     * @return {@code true} if an element was removed as a result of this call
//     * @throws ClassCastException   if the class of the specified element
//     *                              is incompatible with this deque
//     *                              (<a href="Collection.html#optional-restrictions">optional</a>)
//     * @throws NullPointerException if the specified element is null and this
//     *                              deque does not permit null elements
//     *                              (<a href="Collection.html#optional-restrictions">optional</a>)
//     */
//    @Override
//    public boolean removeFirstOccurrence(Object o) {
//
//        if (size<1){
//            return false;
//        }
//
//        Node<T> currentNode = this.first;
//
//        for (int i = 0 ; i<size;i++){
//            if (currentNode.currentObject.equals(o) ){
//                Node<T> previousNode = currentNode.previous;
//                Node<T> nextNode = currentNode.next;
//                previousNode.next = nextNode;
//                nextNode.previous = previousNode;
//                size--;
//                return true;
//            }  else {
//                currentNode = currentNode.next;
//            }
//        }
//
//
//        return false;
//    }
//
//    /**
//     * Removes the last occurrence of the specified element from this deque.
//     * If the deque does not contain the element, it is unchanged.
//     * More formally, removes the last element {@code e} such that
//     * <tt>(o==null&nbsp;?&nbsp;e==null&nbsp;:&nbsp;o.equals(e))</tt>
//     * (if such an element exists).
//     * Returns {@code true} if this deque contained the specified element
//     * (or equivalently, if this deque changed as a result of the call).
//     *
//     * @param o element to be removed from this deque, if present
//     * @return {@code true} if an element was removed as a result of this call
//     * @throws ClassCastException   if the class of the specified element
//     *                              is incompatible with this deque
//     *                              (<a href="Collection.html#optional-restrictions">optional</a>)
//     * @throws NullPointerException if the specified element is null and this
//     *                              deque does not permit null elements
//     *                              (<a href="Collection.html#optional-restrictions">optional</a>)
//     */
//    @Override
//    public boolean removeLastOccurrence(Object o) {
//
//        if (size<1){
//            return false;
//        }
//
//        Node<T> currentNode = this.last;
//
//        for (int i = 0 ; i<size;i++){
//            if (currentNode.currentObject.equals(o) ){
//                Node<T> previousNode = currentNode.previous;
//                Node<T> nextNode = currentNode.last;
//                previousNode.last = nextNode;
//                nextNode.previous = previousNode;
//                size--;
//                return true;
//            }  else {
//                currentNode = currentNode.last;
//            }
//        }
//
//        return false;
//    }
//
//    /**
//     * Inserts the specified element into the queue represented by this deque
//     * (in other words, at the tail of this deque) if it is possible to do so
//     * immediately without violating capacity restrictions, returning
//     * {@code true} upon success and {@code false} if no space is currently
//     * available.  When using a capacity-restricted deque, this method is
//     * generally preferable to the {@link #add} method, which can fail to
//     * insert an element only by throwing an exception.
//     * <p>
//     * <p>This method is equivalent to {@link #offerLast}.
//     *
//     * @param t the element to add
//     * @return {@code true} if the element was added to this deque, else
//     * {@code false}
//     * @throws ClassCastException       if the class of the specified element
//     *                                  prevents it from being added to this deque
//     * @throws NullPointerException     if the specified element is null and this
//     *                                  deque does not permit null elements
//     * @throws IllegalArgumentException if some property of the specified
//     *                                  element prevents it from being added to this deque
//     */
//    @Override
//    public boolean offer(T t) {
//        return offerLast(t);
//    }
//
//    /**
//     * Retrieves and removes the head of the queue represented by this deque
//     * (in other words, the first element of this deque).
//     * This method differs from {@link #poll poll} only in that it throws an
//     * exception if this deque is empty.
//     * <p>
//     * <p>This method is equivalent to {@link #removeFirst()}.
//     *
//     * @return the head of the queue represented by this deque
//     * @throws NoSuchElementException if this deque is empty
//     */
//    @Override
//    public T remove() {
//        return removeFirst();
//    }
//
//    /**
//     * Retrieves and removes the head of the queue represented by this deque
//     * (in other words, the first element of this deque), or returns
//     * {@code null} if this deque is empty.
//     * <p>
//     * <p>This method is equivalent to {@link #pollFirst()}.
//     *
//     * @return the first element of this deque, or {@code null} if
//     * this deque is empty
//     */
//    @Override
//    public T poll() {
//        return pollFirst();
//    }
//
//    /**
//     * Retrieves, but does not remove, the head of the queue represented by
//     * this deque (in other words, the first element of this deque).
//     * This method differs from {@link #peek peek} only in that it throws an
//     * exception if this deque is empty.
//     * <p>
//     * <p>This method is equivalent to {@link #getFirst()}.
//     *
//     * @return the head of the queue represented by this deque
//     * @throws NoSuchElementException if this deque is empty
//     */
//    @Override
//    public T element() {
//        return getFirst();
//    }
//
//    /**
//     * Retrieves, but does not remove, the head of the queue represented by
//     * this deque (in other words, the first element of this deque), or
//     * returns {@code null} if this deque is empty.
//     * <p>
//     * <p>This method is equivalent to {@link #peekFirst()}.
//     *
//     * @return the head of the queue represented by this deque, or
//     * {@code null} if this deque is empty
//     */
//    @Override
//    public T peek() {
//        return peekFirst();
//    }
//
//    /**
//     * Pushes an element onto the stack represented by this deque (in other
//     * words, at the head of this deque) if it is possible to do so
//     * immediately without violating capacity restrictions, throwing an
//     * {@code IllegalStateException} if no space is currently available.
//     * <p>
//     * <p>This method is equivalent to {@link #addFirst}.
//     *
//     * @param t the element to push
//     * @throws IllegalStateException    if the element cannot be added at this
//     *                                  time due to capacity restrictions
//     * @throws ClassCastException       if the class of the specified element
//     *                                  prevents it from being added to this deque
//     * @throws NullPointerException     if the specified element is null and this
//     *                                  deque does not permit null elements
//     * @throws IllegalArgumentException if some property of the specified
//     *                                  element prevents it from being added to this deque
//     */
//    @Override
//    public void push(T t) {
//        addFirst(t);
//
//    }
//
//    /**
//     * Pops an element from the stack represented by this deque.  In other
//     * words, removes and returns the first element of this deque.
//     * <p>
//     * <p>This method is equivalent to {@link #removeFirst()}.
//     *
//     * @return the element at the front of this deque (which is the top
//     * of the stack represented by this deque)
//     * @throws NoSuchElementException if this deque is empty
//     */
//    @Override
//    public T pop() {
//        return removeFirst();
//    }
//
//    /**
//     * Returns an iterator over the elements in this deque in reverse
//     * sequential order.  The elements will be returned in order from
//     * last (tail) to first (head).
//     *
//     * @return an iterator over the elements in this deque in reverse
//     * sequence
//     */
//    @Override
//    public Iterator<T> descendingIterator() {
//
//        return null;
//    }
//
//    /**
//     * Returns the number of elements in this list.  If this list contains
//     * more than <tt>Integer.MAX_VALUE</tt> elements, returns
//     * <tt>Integer.MAX_VALUE</tt>.
//     *
//     * @return the number of elements in this list
//     */
//    @Override
//    public int size() {
//        return size;
//    }
//
//    /**
//     * Returns <tt>true</tt> if this list contains no elements.
//     *
//     * @return <tt>true</tt> if this list contains no elements
//     */
//    @Override
//    public boolean isEmpty() {
//        return size > 0;
//    }
//
//    /**
//     * Returns <tt>true</tt> if this list contains the specified element.
//     * More formally, returns <tt>true</tt> if and only if this list contains
//     * at least one element <tt>e</tt> such that
//     * <tt>(o==null&nbsp;?&nbsp;e==null&nbsp;:&nbsp;o.equals(e))</tt>.
//     *
//     * @param o element whose presence in this list is to be tested
//     * @return <tt>true</tt> if this list contains the specified element
//     * @throws ClassCastException   if the type of the specified element
//     *                              is incompatible with this list
//     *                              (<a href="Collection.html#optional-restrictions">optional</a>)
//     * @throws NullPointerException if the specified element is null and this
//     *                              list does not permit null elements
//     *                              (<a href="Collection.html#optional-restrictions">optional</a>)
//     */
//    @Override
//    public boolean contains(Object o) {
//
//        if (size<1){
//            return false;
//        }
//
//        Node<T> currentNode = this.first;
//
//        for (int i = 0 ; i<size;i++){
//            if (currentNode.currentObject.equals(o) ){
//                return true;
//            }  else {
//                currentNode = currentNode.next;
//            }
//        }
//        return false;
//    }
//
//    /**
//     * Returns an iterator over the elements in this list in proper sequence.
//     *
//     * @return an iterator over the elements in this list in proper sequence
//     */
//    @Override
//    public Iterator<T> iterator() {
//        return null;
//    }
//
//    /**
//     * Returns an array containing all of the elements in this list in proper
//     * sequence (from first to last element).
//     * <p>
//     * <p>The returned array will be "safe" in that no references to it are
//     * maintained by this list.  (In other words, this method must
//     * allocate a new array even if this list is backed by an array).
//     * The caller is thus free to modify the returned array.
//     * <p>
//     * <p>This method acts as bridge between array-based and collection-based
//     * APIs.
//     *
//     * @return an array containing all of the elements in this list in proper
//     * sequence
//     * @see Arrays#asList(Object[])
//     */
//    @Override
//    public Object[] toArray() {
//        Object[] array = new Object[size];
//
//        Node<T> currentNode = this.first;
//
//        for (int i = 0 ; i<size;i++) {
//
//            array[i] = currentNode.currentObject;
//            currentNode = currentNode.next;
//        }
//        return array;
//    }
//
//    /**
//     * Returns an array containing all of the elements in this list in
//     * proper sequence (from first to last element); the runtime type of
//     * the returned array is that of the specified array.  If the list fits
//     * in the specified array, it is returned therein.  Otherwise, a new
//     * array is allocated with the runtime type of the specified array and
//     * the size of this list.
//     * <p>
//     * <p>If the list fits in the specified array with room to spare (i.e.,
//     * the array has more elements than the list), the element in the array
//     * immediately following the end of the list is set to <tt>null</tt>.
//     * (This is useful in determining the length of the list <i>only</i> if
//     * the caller knows that the list does not contain any null elements.)
//     * <p>
//     * <p>Like the {@link #toArray()} method, this method acts as bridge between
//     * array-based and collection-based APIs.  Further, this method allows
//     * precise control over the runtime type of the output array, and may,
//     * under certain circumstances, be used to save allocation costs.
//     * <p>
//     * <p>Suppose <tt>x</tt> is a list known to contain only strings.
//     * The following code can be used to dump the list into a newly
//     * allocated array of <tt>String</tt>:
//     * <p>
//     * <pre>{@code
//     *     String[] y = x.toArray(new String[0]);
//     * }</pre>
//     * <p>
//     * Note that <tt>toArray(new Object[0])</tt> is identical in function to
//     * <tt>toArray()</tt>.
//     *
//     * @param a the array into which the elements of this list are to
//     *          be stored, if it is big enough; otherwise, a new array of the
//     *          same runtime type is allocated for this purpose.
//     * @return an array containing the elements of this list
//     * @throws ArrayStoreException  if the runtime type of the specified array
//     *                              is not a supertype of the runtime type of every element in
//     *                              this list
//     * @throws NullPointerException if the specified array is null
//     */
//    @Override
//    public <T1> T1[] toArray(T1[] a) {
//        T1[] array
//    }
//
//    /**
//     * Appends the specified element to the end of this list (optional
//     * operation).
//     * <p>
//     * <p>Lists that support this operation may place limitations on what
//     * elements may be added to this list.  In particular, some
//     * lists will refuse to add null elements, and others will impose
//     * restrictions on the type of elements that may be added.  List
//     * classes should clearly specify in their documentation any restrictions
//     * on what elements may be added.
//     *
//     * @param t element to be appended to this list
//     * @return <tt>true</tt> (as specified by {@link Collection#add})
//     * @throws UnsupportedOperationException if the <tt>add</tt> operation
//     *                                       is not supported by this list
//     * @throws ClassCastException            if the class of the specified element
//     *                                       prevents it from being added to this list
//     * @throws NullPointerException          if the specified element is null and this
//     *                                       list does not permit null elements
//     * @throws IllegalArgumentException      if some property of this element
//     *                                       prevents it from being added to this list
//     */
//    @Override
//    public boolean add(T t) {
//        return false;
//    }
//
//    /**
//     * Removes the first occurrence of the specified element from this list,
//     * if it is present (optional operation).  If this list does not contain
//     * the element, it is unchanged.  More formally, removes the element with
//     * the lowest index <tt>i</tt> such that
//     * <tt>(o==null&nbsp;?&nbsp;get(i)==null&nbsp;:&nbsp;o.equals(get(i)))</tt>
//     * (if such an element exists).  Returns <tt>true</tt> if this list
//     * contained the specified element (or equivalently, if this list changed
//     * as a result of the call).
//     *
//     * @param o element to be removed from this list, if present
//     * @return <tt>true</tt> if this list contained the specified element
//     * @throws ClassCastException            if the type of the specified element
//     *                                       is incompatible with this list
//     *                                       (<a href="Collection.html#optional-restrictions">optional</a>)
//     * @throws NullPointerException          if the specified element is null and this
//     *                                       list does not permit null elements
//     *                                       (<a href="Collection.html#optional-restrictions">optional</a>)
//     * @throws UnsupportedOperationException if the <tt>remove</tt> operation
//     *                                       is not supported by this list
//     */
//    @Override
//    public boolean remove(Object o) {
//        return false;
//    }
//
//    /**
//     * Returns <tt>true</tt> if this list contains all of the elements of the
//     * specified collection.
//     *
//     * @param c collection to be checked for containment in this list
//     * @return <tt>true</tt> if this list contains all of the elements of the
//     * specified collection
//     * @throws ClassCastException   if the types of one or more elements
//     *                              in the specified collection are incompatible with this
//     *                              list
//     *                              (<a href="Collection.html#optional-restrictions">optional</a>)
//     * @throws NullPointerException if the specified collection contains one
//     *                              or more null elements and this list does not permit null
//     *                              elements
//     *                              (<a href="Collection.html#optional-restrictions">optional</a>),
//     *                              or if the specified collection is null
//     * @see #contains(Object)
//     */
//    @Override
//    public boolean containsAll(Collection<?> c) {
//        return false;
//    }
//
//    /**
//     * Appends all of the elements in the specified collection to the end of
//     * this list, in the order that they are returned by the specified
//     * collection's iterator (optional operation).  The behavior of this
//     * operation is undefined if the specified collection is modified while
//     * the operation is in progress.  (Note that this will occur if the
//     * specified collection is this list, and it's nonempty.)
//     *
//     * @param c collection containing elements to be added to this list
//     * @return <tt>true</tt> if this list changed as a result of the call
//     * @throws UnsupportedOperationException if the <tt>addAll</tt> operation
//     *                                       is not supported by this list
//     * @throws ClassCastException            if the class of an element of the specified
//     *                                       collection prevents it from being added to this list
//     * @throws NullPointerException          if the specified collection contains one
//     *                                       or more null elements and this list does not permit null
//     *                                       elements, or if the specified collection is null
//     * @throws IllegalArgumentException      if some property of an element of the
//     *                                       specified collection prevents it from being added to this list
//     * @see #add(Object)
//     */
//    @Override
//    public boolean addAll(Collection<? extends T> c) {
//        return false;
//    }
//
//    /**
//     * Inserts all of the elements in the specified collection into this
//     * list at the specified position (optional operation).  Shifts the
//     * element currently at that position (if any) and any subsequent
//     * elements to the right (increases their indices).  The new elements
//     * will appear in this list in the order that they are returned by the
//     * specified collection's iterator.  The behavior of this operation is
//     * undefined if the specified collection is modified while the
//     * operation is in progress.  (Note that this will occur if the specified
//     * collection is this list, and it's nonempty.)
//     *
//     * @param index index at which to insert the first element from the
//     *              specified collection
//     * @param c     collection containing elements to be added to this list
//     * @return <tt>true</tt> if this list changed as a result of the call
//     * @throws UnsupportedOperationException if the <tt>addAll</tt> operation
//     *                                       is not supported by this list
//     * @throws ClassCastException            if the class of an element of the specified
//     *                                       collection prevents it from being added to this list
//     * @throws NullPointerException          if the specified collection contains one
//     *                                       or more null elements and this list does not permit null
//     *                                       elements, or if the specified collection is null
//     * @throws IllegalArgumentException      if some property of an element of the
//     *                                       specified collection prevents it from being added to this list
//     * @throws IndexOutOfBoundsException     if the index is out of range
//     *                                       (<tt>index &lt; 0 || index &gt; size()</tt>)
//     */
//    @Override
//    public boolean addAll(int index, Collection<? extends T> c) {
//        return false;
//    }
//
//    /**
//     * Removes from this list all of its elements that are contained in the
//     * specified collection (optional operation).
//     *
//     * @param c collection containing elements to be removed from this list
//     * @return <tt>true</tt> if this list changed as a result of the call
//     * @throws UnsupportedOperationException if the <tt>removeAll</tt> operation
//     *                                       is not supported by this list
//     * @throws ClassCastException            if the class of an element of this list
//     *                                       is incompatible with the specified collection
//     *                                       (<a href="Collection.html#optional-restrictions">optional</a>)
//     * @throws NullPointerException          if this list contains a null element and the
//     *                                       specified collection does not permit null elements
//     *                                       (<a href="Collection.html#optional-restrictions">optional</a>),
//     *                                       or if the specified collection is null
//     * @see #remove(Object)
//     * @see #contains(Object)
//     */
//    @Override
//    public boolean removeAll(Collection<?> c) {
//        return false;
//    }
//
//    /**
//     * Retains only the elements in this list that are contained in the
//     * specified collection (optional operation).  In other words, removes
//     * from this list all of its elements that are not contained in the
//     * specified collection.
//     *
//     * @param c collection containing elements to be retained in this list
//     * @return <tt>true</tt> if this list changed as a result of the call
//     * @throws UnsupportedOperationException if the <tt>retainAll</tt> operation
//     *                                       is not supported by this list
//     * @throws ClassCastException            if the class of an element of this list
//     *                                       is incompatible with the specified collection
//     *                                       (<a href="Collection.html#optional-restrictions">optional</a>)
//     * @throws NullPointerException          if this list contains a null element and the
//     *                                       specified collection does not permit null elements
//     *                                       (<a href="Collection.html#optional-restrictions">optional</a>),
//     *                                       or if the specified collection is null
//     * @see #remove(Object)
//     * @see #contains(Object)
//     */
//    @Override
//    public boolean retainAll(Collection<?> c) {
//        return false;
//    }
//
//    /**
//     * Removes all of the elements from this list (optional operation).
//     * The list will be empty after this call returns.
//     *
//     * @throws UnsupportedOperationException if the <tt>clear</tt> operation
//     *                                       is not supported by this list
//     */
//    @Override
//    public void clear() {
//
//    }
//
//    /**
//     * Returns the element at the specified position in this list.
//     *
//     * @param index index of the element to return
//     * @return the element at the specified position in this list
//     * @throws IndexOutOfBoundsException if the index is out of range
//     *                                   (<tt>index &lt; 0 || index &gt;= size()</tt>)
//     */
//    @Override
//    public T get(int index) {
//        return null;
//    }
//
//    /**
//     * Replaces the element at the specified position in this list with the
//     * specified element (optional operation).
//     *
//     * @param index   index of the element to replace
//     * @param element element to be stored at the specified position
//     * @return the element previously at the specified position
//     * @throws UnsupportedOperationException if the <tt>set</tt> operation
//     *                                       is not supported by this list
//     * @throws ClassCastException            if the class of the specified element
//     *                                       prevents it from being added to this list
//     * @throws NullPointerException          if the specified element is null and
//     *                                       this list does not permit null elements
//     * @throws IllegalArgumentException      if some property of the specified
//     *                                       element prevents it from being added to this list
//     * @throws IndexOutOfBoundsException     if the index is out of range
//     *                                       (<tt>index &lt; 0 || index &gt;= size()</tt>)
//     */
//    @Override
//    public T set(int index, T element) {
//        return null;
//    }
//
//    /**
//     * Inserts the specified element at the specified position in this list
//     * (optional operation).  Shifts the element currently at that position
//     * (if any) and any subsequent elements to the right (adds one to their
//     * indices).
//     *
//     * @param index   index at which the specified element is to be inserted
//     * @param element element to be inserted
//     * @throws UnsupportedOperationException if the <tt>add</tt> operation
//     *                                       is not supported by this list
//     * @throws ClassCastException            if the class of the specified element
//     *                                       prevents it from being added to this list
//     * @throws NullPointerException          if the specified element is null and
//     *                                       this list does not permit null elements
//     * @throws IllegalArgumentException      if some property of the specified
//     *                                       element prevents it from being added to this list
//     * @throws IndexOutOfBoundsException     if the index is out of range
//     *                                       (<tt>index &lt; 0 || index &gt; size()</tt>)
//     */
//    @Override
//    public void add(int index, T element) {
//
//    }
//
//    /**
//     * Removes the element at the specified position in this list (optional
//     * operation).  Shifts any subsequent elements to the left (subtracts one
//     * from their indices).  Returns the element that was removed from the
//     * list.
//     *
//     * @param index the index of the element to be removed
//     * @return the element previously at the specified position
//     * @throws UnsupportedOperationException if the <tt>remove</tt> operation
//     *                                       is not supported by this list
//     * @throws IndexOutOfBoundsException     if the index is out of range
//     *                                       (<tt>index &lt; 0 || index &gt;= size()</tt>)
//     */
//    @Override
//    public T remove(int index) {
//        return null;
//    }
//
//    /**
//     * Returns the index of the first occurrence of the specified element
//     * in this list, or -1 if this list does not contain the element.
//     * More formally, returns the lowest index <tt>i</tt> such that
//     * <tt>(o==null&nbsp;?&nbsp;get(i)==null&nbsp;:&nbsp;o.equals(get(i)))</tt>,
//     * or -1 if there is no such index.
//     *
//     * @param o element to search for
//     * @return the index of the first occurrence of the specified element in
//     * this list, or -1 if this list does not contain the element
//     * @throws ClassCastException   if the type of the specified element
//     *                              is incompatible with this list
//     *                              (<a href="Collection.html#optional-restrictions">optional</a>)
//     * @throws NullPointerException if the specified element is null and this
//     *                              list does not permit null elements
//     *                              (<a href="Collection.html#optional-restrictions">optional</a>)
//     */
//    @Override
//    public int indexOf(Object o) {
//        return 0;
//    }
//
//    /**
//     * Returns the index of the last occurrence of the specified element
//     * in this list, or -1 if this list does not contain the element.
//     * More formally, returns the highest index <tt>i</tt> such that
//     * <tt>(o==null&nbsp;?&nbsp;get(i)==null&nbsp;:&nbsp;o.equals(get(i)))</tt>,
//     * or -1 if there is no such index.
//     *
//     * @param o element to search for
//     * @return the index of the last occurrence of the specified element in
//     * this list, or -1 if this list does not contain the element
//     * @throws ClassCastException   if the type of the specified element
//     *                              is incompatible with this list
//     *                              (<a href="Collection.html#optional-restrictions">optional</a>)
//     * @throws NullPointerException if the specified element is null and this
//     *                              list does not permit null elements
//     *                              (<a href="Collection.html#optional-restrictions">optional</a>)
//     */
//    @Override
//    public int lastIndexOf(Object o) {
//        return 0;
//    }
//
//    /**
//     * Returns a list iterator over the elements in this list (in proper
//     * sequence).
//     *
//     * @return a list iterator over the elements in this list (in proper
//     * sequence)
//     */
//    @Override
//    public ListIterator<T> listIterator() {
//        return null;
//    }
//
//    /**
//     * Returns a list iterator over the elements in this list (in proper
//     * sequence), starting at the specified position in the list.
//     * The specified index indicates the first element that would be
//     * returned by an initial call to {@link ListIterator#next next}.
//     * An initial call to {@link ListIterator#previous previous} would
//     * return the element with the specified index minus one.
//     *
//     * @param index index of the first element to be returned from the
//     *              list iterator (by a call to {@link ListIterator#next next})
//     * @return a list iterator over the elements in this list (in proper
//     * sequence), starting at the specified position in the list
//     * @throws IndexOutOfBoundsException if the index is out of range
//     *                                   ({@code index < 0 || index > size()})
//     */
//    @Override
//    public ListIterator<T> listIterator(int index) {
//        return null;
//    }
//
//    /**
//     * Returns a view of the portion of this list between the specified
//     * <tt>fromIndex</tt>, inclusive, and <tt>toIndex</tt>, exclusive.  (If
//     * <tt>fromIndex</tt> and <tt>toIndex</tt> are equal, the returned list is
//     * empty.)  The returned list is backed by this list, so non-structural
//     * changes in the returned list are reflected in this list, and vice-versa.
//     * The returned list supports all of the optional list operations supported
//     * by this list.<p>
//     * <p>
//     * This method eliminates the need for explicit range operations (of
//     * the sort that commonly exist for arrays).  Any operation that expects
//     * a list can be used as a range operation by passing a subList view
//     * instead of a whole list.  For example, the following idiom
//     * removes a range of elements from a list:
//     * <pre>{@code
//     *      list.subList(from, to).clear();
//     * }</pre>
//     * Similar idioms may be constructed for <tt>indexOf</tt> and
//     * <tt>lastIndexOf</tt>, and all of the algorithms in the
//     * <tt>Collections</tt> class can be applied to a subList.<p>
//     * <p>
//     * The semantics of the list returned by this method become undefined if
//     * the backing list (i.e., this list) is <i>structurally modified</i> in
//     * any way other than via the returned list.  (Structural modifications are
//     * those that change the size of this list, or otherwise perturb it in such
//     * a fashion that iterations in progress may yield incorrect results.)
//     *
//     * @param fromIndex low endpoint (inclusive) of the subList
//     * @param toIndex   high endpoint (exclusive) of the subList
//     * @return a view of the specified range within this list
//     * @throws IndexOutOfBoundsException for an illegal endpoint index value
//     *                                   (<tt>fromIndex &lt; 0 || toIndex &gt; size ||
//     *                                   fromIndex &gt; toIndex</tt>)
//     */
//    @Override
//    public List<T> subList(int fromIndex, int toIndex) {
//        return null;
//    }
//}
