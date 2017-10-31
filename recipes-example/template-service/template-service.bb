#
#   Copyright (C) 2017 Pelagicore AB
#   SPDX-License-Identifier: MIT
#

SUMMARY = "A template C/C++ service"
DESCRIPTION = "A C/C++ source code repository blueprint"
AUTHOR = "Gordan Markuš <gordan.markus@pelagicore.com>"
HOMEPAGE = "https://github.com/Pelagicore/template-service"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=815ca599c9df247a0c7f619bab123dad"
PV = "1.0+git${SRCREV}"
PR = "r0"

PACKAGECONFIG ??= ""
PACKAGECONFIG[templatelibrary] = "-DENABLE_TEMPLATE_LIBRARY=ON,-DENABLE_TEMPLATE_LIBRARY=OFF,template-library"

SRCREV = "6c72acc1f9f842b4248ffa858266f437b29f1cce"
SRC_URI = "git://github.com/Pelagicore/template-service.git;protocol=https;branch=master"

S = "${WORKDIR}/git/"

inherit cmake pkgconfig

PACKAGES = " \
    ${PN}     \
    ${PN}-dbg \
    ${PN}-dev \
"
