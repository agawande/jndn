/**
 * Copyright (C) 2014-2017 Regents of the University of California.
 * @author: Jeff Thompson <jefft0@remap.ucla.edu>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * A copy of the GNU Lesser General Public License is in the file COPYING.
 */

package net.named_data.jndn.encoding;

/**
 * A TlvWireFormat extends WireFormat to override its methods to
 * implement encoding and decoding using the preferred implementation of
 * NDN-TLV.
 */
public class TlvWireFormat extends Tlv0_2WireFormat {
  /**
   * Get a singleton instance of a TlvWireFormat.  Assuming that the default
   * wire format was set with
   * WireFormat.setDefaultWireFormat(TlvWireFormat.get()), you can check if this
   * is the default wire encoding with
   * if (WireFormat.getDefaultWireFormat() == TlvWireFormat.get()).
   * @return The singleton instance.
   */
  public static TlvWireFormat
  get()
  {
    return instance_;
  }

  private static TlvWireFormat instance_ = new TlvWireFormat();
}
