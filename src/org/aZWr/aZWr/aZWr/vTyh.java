// 
// Decompiled by Procyon v0.5.36
// 

package org.aZWr.aZWr.aZWr;

import java.util.Map;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.List;

public final class vTyh<Type>
{
    private List<Type> tEdg;
    private List<Type> TryJ;
    private List<foWu> NCuT;
    private foWu Rarr;
    private Comparator<Type> RjRQ;
    private TreeMap<Integer, Integer> aqrV;
    
    private vTyh(final Type[] a, final Type[] a2, final Comparator<Type> comparator) {
        this(Arrays.asList(a), Arrays.asList(a2), null);
    }
    
    public vTyh(final Type[] array, final Type[] array2) {
        this(array, array2, null);
    }
    
    public vTyh(final List<Type> tEdg, final List<Type> tryJ, final Comparator<Type> rjRQ) {
        this.NCuT = new ArrayList<foWu>();
        this.tEdg = tEdg;
        this.TryJ = tryJ;
        this.RjRQ = rjRQ;
        this.aqrV = null;
    }
    
    private vTyh(final List<Type> list, final List<Type> list2) {
        this(list, list2, null);
    }
    
    public final List<foWu> tEdg() {
        int n = 0;
        int n2 = this.tEdg.size() - 1;
        int n3 = 0;
        int n4 = this.TryJ.size() - 1;
        final TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
        while (n <= n2 && n3 <= n4 && this.tEdg(this.tEdg.get(n), this.TryJ.get(n3))) {
            treeMap.put(n++, n3++);
        }
        while (n <= n2 && n3 <= n4 && this.tEdg(this.tEdg.get(n2), this.TryJ.get(n4))) {
            treeMap.put(n2--, n4--);
        }
        Cloneable cloneable;
        if (this.RjRQ == null) {
            if (this.tEdg.size() > 0 && this.tEdg.get(0) instanceof Comparable) {
                cloneable = new TreeMap<Object, Object>();
            }
            else {
                cloneable = new HashMap<Object, Object>();
            }
        }
        else {
            cloneable = new TreeMap<Object, Object>(this.RjRQ);
        }
        for (int i = n3; i <= n4; ++i) {
            final Type value = this.TryJ.get(i);
            List<Integer> list;
            if ((list = ((Map<Type, List<Integer>>)cloneable).get(value)) == null) {
                list = new ArrayList<Integer>();
                ((Map<Type, List<Integer>>)cloneable).put(value, list);
            }
            list.add(i);
        }
        this.aqrV = new TreeMap<Integer, Integer>();
        final HashMap<Object, Object[]> hashMap = new HashMap<Object, Object[]>();
        for (int j = n; j <= n2; ++j) {
            final List<Integer> list2;
            if ((list2 = ((Map<Type, List<Integer>>)cloneable).get(this.tEdg.get(j))) != null) {
                Integer n5 = 0;
                final List<Integer> list3 = list2;
                final ListIterator<Integer> listIterator = list3.listIterator(list3.size());
                while (listIterator.hasPrevious()) {
                    final Integer n6 = listIterator.previous();
                    if ((n5 = this.NCuT(n6, n5)) != null) {
                        hashMap.put(n5, new Object[] { (n5 > 0) ? hashMap.get(n5 - 1) : null, j, n6 });
                    }
                }
            }
        }
        if (this.aqrV.size() > 0) {
            for (Object[] array = hashMap.get(this.aqrV.lastKey()); array != null; array = (Object[])array[0]) {
                treeMap.put((Integer)array[1], (Integer)array[2]);
            }
        }
        final int n7;
        final Integer[] array2 = new Integer[n7 = ((treeMap.size() == 0) ? 0 : (1 + treeMap.lastKey()))];
        for (final Integer key : treeMap.keySet()) {
            array2[key] = treeMap.get(key);
        }
        final Integer[] array3 = array2;
        final int n8 = this.tEdg.size() - 1;
        final int n9 = this.TryJ.size() - 1;
        int k = 0;
        int n10;
        int l;
        for (n10 = array3.length - 1, l = 0; l <= n10; ++l) {
            final Integer n11;
            if ((n11 = array3[l]) == null) {
                this.tEdg(l, k);
            }
            else {
                while (k < n11) {
                    this.TryJ(l, k++);
                }
                ++k;
                if (this.Rarr != null) {
                    this.NCuT.add(this.Rarr);
                    this.Rarr = null;
                }
            }
        }
        while (l <= n8 || k <= n9) {
            if (l == n8 + 1 && k <= n9) {
                while (k <= n9) {
                    this.TryJ(l, k++);
                }
            }
            if (k == n9 + 1 && l <= n8) {
                while (l <= n8) {
                    this.tEdg(l++, k);
                }
            }
            if (l <= n8) {
                this.tEdg(l++, k);
            }
            if (k <= n9) {
                this.TryJ(l, k++);
            }
        }
        if (this.Rarr != null) {
            this.NCuT.add(this.Rarr);
        }
        return this.NCuT;
    }
    
    private void TryJ() {
        final Integer[] ffoi = this.Ffoi();
        final int n = this.tEdg.size() - 1;
        final int n2 = this.TryJ.size() - 1;
        int i = 0;
        int n3;
        int j;
        for (n3 = ffoi.length - 1, j = 0; j <= n3; ++j) {
            final Integer n4;
            if ((n4 = ffoi[j]) == null) {
                this.tEdg(j, i);
            }
            else {
                while (i < n4) {
                    this.TryJ(j, i++);
                }
                ++i;
                this.LrxC();
            }
        }
        while (j <= n || i <= n2) {
            if (j == n + 1 && i <= n2) {
                while (i <= n2) {
                    this.TryJ(j, i++);
                }
            }
            if (i == n2 + 1 && j <= n) {
                while (j <= n) {
                    this.tEdg(j++, i);
                }
            }
            if (j <= n) {
                this.tEdg(j++, i);
            }
            if (i <= n2) {
                this.TryJ(j, i++);
            }
        }
    }
    
    private static boolean NCuT() {
        return false;
    }
    
    private static boolean Rarr() {
        return false;
    }
    
    private static void RjRQ() {
    }
    
    private static void aqrV() {
    }
    
    private void tEdg(final int n, final int n2) {
        if (this.Rarr == null) {
            this.Rarr = new foWu(n, n, n2, -1);
            return;
        }
        this.Rarr.tEdg(n);
    }
    
    private void TryJ(final int n, final int n2) {
        if (this.Rarr == null) {
            this.Rarr = new foWu(n, -1, n2, n2);
            return;
        }
        this.Rarr.TryJ(n2);
    }
    
    private void LrxC() {
        if (this.Rarr != null) {
            this.NCuT.add(this.Rarr);
            this.Rarr = null;
        }
    }
    
    private boolean tEdg(final Type type, final Type obj) {
        if (this.RjRQ == null) {
            return type.equals(obj);
        }
        return this.RjRQ.compare(type, obj) == 0;
    }
    
    private Integer[] Ffoi() {
        int n = 0;
        int n2 = this.tEdg.size() - 1;
        int n3 = 0;
        int n4 = this.TryJ.size() - 1;
        final TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
        while (n <= n2 && n3 <= n4 && this.tEdg(this.tEdg.get(n), this.TryJ.get(n3))) {
            treeMap.put(n++, n3++);
        }
        while (n <= n2 && n3 <= n4 && this.tEdg(this.tEdg.get(n2), this.TryJ.get(n4))) {
            treeMap.put(n2--, n4--);
        }
        Cloneable cloneable;
        if (this.RjRQ == null) {
            if (this.tEdg.size() > 0 && this.tEdg.get(0) instanceof Comparable) {
                cloneable = new TreeMap<Object, Object>();
            }
            else {
                cloneable = new HashMap<Object, Object>();
            }
        }
        else {
            cloneable = new TreeMap<Object, Object>(this.RjRQ);
        }
        for (int i = n3; i <= n4; ++i) {
            final Type value = this.TryJ.get(i);
            List<Integer> list;
            if ((list = ((Map<Type, List<Integer>>)cloneable).get(value)) == null) {
                list = new ArrayList<Integer>();
                ((Map<Type, List<Integer>>)cloneable).put(value, list);
            }
            list.add(i);
        }
        this.aqrV = new TreeMap<Integer, Integer>();
        final HashMap<Object, Object[]> hashMap = new HashMap<Object, Object[]>();
        for (int j = n; j <= n2; ++j) {
            final List<Integer> list2;
            if ((list2 = ((Map<Type, List<Integer>>)cloneable).get(this.tEdg.get(j))) != null) {
                Integer n5 = 0;
                final List<Integer> list3 = list2;
                final ListIterator<Integer> listIterator = list3.listIterator(list3.size());
                while (listIterator.hasPrevious()) {
                    final Integer n6 = listIterator.previous();
                    if ((n5 = this.NCuT(n6, n5)) != null) {
                        hashMap.put(n5, new Object[] { (n5 > 0) ? hashMap.get(n5 - 1) : null, j, n6 });
                    }
                }
            }
        }
        if (this.aqrV.size() > 0) {
            for (Object[] array = hashMap.get(this.aqrV.lastKey()); array != null; array = (Object[])array[0]) {
                treeMap.put((Integer)array[1], (Integer)array[2]);
            }
        }
        final int n7;
        final Integer[] array2 = new Integer[n7 = ((treeMap.size() == 0) ? 0 : (1 + treeMap.lastKey()))];
        for (final Integer key : treeMap.keySet()) {
            array2[key] = treeMap.get(key);
        }
        return array2;
    }
    
    private static boolean tEdg(final Integer n) {
        return n != null && n != 0;
    }
    
    private boolean tEdg(Integer key, final Integer anotherInteger) {
        return (key = this.aqrV.get(key)) != null && anotherInteger != null && key.compareTo(anotherInteger) > 0;
    }
    
    private boolean TryJ(Integer key, final Integer anotherInteger) {
        return (key = this.aqrV.get(key)) != null && (anotherInteger == null || key.compareTo(anotherInteger) < 0);
    }
    
    private Integer MnsE() {
        return this.aqrV.get(this.aqrV.lastKey());
    }
    
    private void TryJ(final Integer value) {
        Integer key;
        if (this.aqrV.size() == 0) {
            key = 0;
        }
        else {
            key = this.aqrV.lastKey() + 1;
        }
        this.aqrV.put(key, value);
    }
    
    private Integer NCuT(final Integer value, Integer n) {
        final Integer n2;
        final Integer n3;
        if (tEdg(n) && ((n2 = this.aqrV.get(n)) != null && value != null && n2.compareTo(value) > 0) && ((n3 = this.aqrV.get(n - 1)) != null && (value == null || n3.compareTo(value) < 0))) {
            this.aqrV.put(n, value);
        }
        else {
            int n4 = -1;
            if (tEdg(n)) {
                n4 = n;
            }
            else if (this.aqrV.size() > 0) {
                n4 = this.aqrV.lastKey();
            }
            if (n4 == -1 || value.compareTo(this.aqrV.get(this.aqrV.lastKey())) > 0) {
                Integer key;
                if (this.aqrV.size() == 0) {
                    key = 0;
                }
                else {
                    key = this.aqrV.lastKey() + 1;
                }
                this.aqrV.put(key, value);
                n = n4 + 1;
            }
            else {
                int i = 0;
                while (i <= n4) {
                    final int j = (n4 + i) / 2;
                    final int compareTo;
                    if ((compareTo = value.compareTo(this.aqrV.get(j))) == 0) {
                        return null;
                    }
                    if (compareTo > 0) {
                        i = j + 1;
                    }
                    else {
                        n4 = j - 1;
                    }
                }
                this.aqrV.put(i, value);
                n = i;
            }
        }
        return n;
    }
}
