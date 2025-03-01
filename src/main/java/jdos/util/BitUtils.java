package jdos.util;

// $Id: BitUtils.java,v 1.1 2004/07/29 03:45:31 Dave Exp $
/*
 * BitUtils.java
 * Copyright (C) 2003, 2004 David Clausen
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 */

/**
 * Helper class providing bit-shift functions which are used internally by
 * the <code>Float</code> and <code>Double</code> classes.
 */
final public class BitUtils {

    private BitUtils() {
    }

    /**
     * Returns the number of contiguous 0 bits starting with the most significant
     * bit of x.
     */
    static int countLeadingZeros(int x) {
        return Integer.numberOfLeadingZeros(x);
    }

    /**
     * Returns the number of contiguous 0 bits starting with the most significant
     * bit of x.
     */
    static int countLeadingZeros(long x) {
        return Long.numberOfLeadingZeros(x);
    }

    /**
     * Right-shift x by count bits, and if any of the shifted-off bits are 1,
     * set the least significant bit of the return value to 1.
     */
    static public int stickyRightShift(int x, int count) {
        if (count >= 32) {
            return ((x == 0) ? 0 : 1);
        } else if ((x << (32 - count)) == 0) {
            return x >>> count;
        } else {
            return (x >>> count) | 1;
        }
    }

    /**
     * Right-shift x by count bits, and if any of the shifted-off bits are 1,
     * set the least significant bit of the return value to 1.
     */
    static public long stickyRightShift(long x, int count) {
        if (count >= 64) {
            return ((x == 0) ? 0 : 1);
        } else if ((x << (64 - count)) == 0) {
            return x >>> count;
        } else {
            return (x >>> count) | 1;
        }
    }

    static public void shift64ExtraRightJamming(long a0, long a1, int count, LongRef z0Ptr, LongRef z1Ptr) {
        long z0, z1;
        int negCount = (-count) & 63;

        if (count == 0) {
            z1 = a1;
            z0 = a0;
        } else if (count < 64) {
            z1 = (a0 << negCount) | ((a1 != 0) ? 1 : 0);
            z0 = a0 >> count;
        } else {
            if (count == 64) {
                z1 = a0 | ((a1 != 0) ? 1 : 0);
            } else {
                z1 = ((a0 | a1) != 0) ? 1 : 0;
            }
            z0 = 0;
        }
        z1Ptr.value = z1;
        z0Ptr.value = z0;
    }

    /**
     * Right-shift x by count bits, and round the result using half-even rounding.
     */
    static int roundingRightShift(int x, int count) {
        int remainder;
        if (count > 32) {
            return 0;
        } else if (count == 32) {
            remainder = x;
            x = 0;
        } else {
            remainder = x << (32 - count);
            x >>>= count;
        }
        if ((remainder < 0) && ((remainder != 0x80000000) || ((x & 1) == 1))) {
            return x + 1;
        }
        return x;
    }

    /**
     * Right-shift x by count bits, and round the result using half-even rounding.
     */
    static long roundingRightShift(long x, int count) {
        long remainder;
        if (count > 64) {
            return 0;
        } else if (count == 64) {
            remainder = x;
            x = 0;
        } else {
            remainder = x << (64 - count);
            x >>>= count;
        }
        if ((remainder < 0)
                && ((remainder != 0x8000000000000000L) || ((x & 1) == 1))) {
            return x + 1;
        }
        return x;
    }

}
