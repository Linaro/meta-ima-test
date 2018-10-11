Meta-ima-test
================================

Introduction
-------------------------

An OpenEmbedded/Yocto Project BSP layer for enabling IMA

The meta-ima-test layer depends on:

	URI: https://github.com/openembedded/openembedded-core
	layers: meta
	branch: master

	URI: https://git.yoctoproject.org/git/meta-ti
	layers: meta-ti
	branch: master

Please follow the recommended setup procedures of your OE distribution.

Usage
-------------------------

To build the IMA enabled kernel:

	MACHINE=beagle-x15-ima bitbake virtual/kernel

Use the results in DEPLOYDIR like you would on a 'regular' beagle-x15 build.

Contributing
-------------------------

Please use github for pull requests: https://github.com/linaro/meta-ima-test/pulls

Reporting bugs
-------------------------

The github issue tracker (https://github.com/linaro/meta-ima-test/issues) is being used to keep track of bugs.

Maintainers: Koen Kooi <koen.kooi@linaro.org>
