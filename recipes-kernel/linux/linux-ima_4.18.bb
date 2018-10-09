require linux.inc

DEPENDS += "openssl-native"

DESCRIPTION = "Linux kernel"
KERNEL_IMAGETYPE ?= "zImage"

COMPATIBLE_MACHINE = "beagle-x15-ima"

FILESPATH =. "${FILE_DIRNAME}/linux-ima-4.18:${FILE_DIRNAME}/linux-ima-4.18/${MACHINE}:"

S = "${WORKDIR}/git"

PV = "4.18.11"

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;protocol=https;branch=linux-4.18.y"
#SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/torvalds/linux.git;protocol=https;branch=master"
SRCREV_pn-${PN} = "2f411a0873a9daa20ae16cf5879d11bbea267582"

SRC_URI += " \
             file://defconfig \
             file://ima.fragment \
            "

KERNEL_CONFIG_FRAGMENTS_append = " \
                                  ${WORKDIR}/ima.fragment \
                                 "

LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"
