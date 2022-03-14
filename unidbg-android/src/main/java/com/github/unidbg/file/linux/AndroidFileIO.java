package com.github.unidbg.file.linux;

import com.github.unidbg.Emulator;
import com.github.unidbg.file.NewFileIO;
import com.github.unidbg.linux.struct.StatFS;
import com.sun.jna.Pointer;

public interface AndroidFileIO extends NewFileIO {

    int SIOCGIFNAME = 0x8910;		/* get iface name		*/
    int SIOCGIFCONF = 0x8912;		/* get iface list		*/
    int SIOCGIFFLAGS = 0x8913;		/* get flags			*/
    int SIOCGIFADDR = 0x8915;    /* get PA address */
    int SIOCSIFADDR = 0x8916;    /* set PA address */  //TODO
    int SIOCGIFHWADDR = 0x8927;  /* Get hardware address */ //TODO

    int fstat(Emulator<?> emulator, StatStructure stat);

    int getdents64(Pointer dirp, int size);

    AndroidFileIO accept(Pointer addr, Pointer addrlen);

    int statfs(StatFS statFS);
}
