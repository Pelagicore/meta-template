#
# Copyright (C) 2019 Luxoft Sweden AB
# SPDX-License-Identifier: MIT
#

DESCRIPTION = "Template for creating a D-Bus Service"
HOMEPAGE = "https://github.com/Pelagicore/template-dbus-service"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=815ca599c9df247a0c7f619bab123dad"
PV = "0.1.0+git${SRCPV}"
PR = "r0"

SRC_URI = "https://github.com/Pelagicore/template-dbus-service.git"
SRCREV = "f8a0e1bc987c2731b98ac69f55972ee9264ab518"

inherit meson systemd

DEPENDS += "glibmm gdbus-codegen-glibmm-native"

S = "${WORKDIR}/git"

FILES_${PN} = " \
    ${bindir}/tdbscli \
    ${bindir}/template-dbus-service \
    ${datadir}/dbus-1 \
    ${systemd_system_unitdir} \
"

SYSTEMD_SERVICE_${PN} = "template-dbus-service.service"
SYSTEMD_AUTO_ENABLE = "disable"
