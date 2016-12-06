.rdata
.align 2
$LC0:
       .ascii	"%d\000"
.text
# label f
# beginfunc 
	.align	2
	.globl f
	.ent f
f:
	 addiu	$sp,$sp,-28
	 sw	$31,16($29)
# var i
# i = 2
       li   $8, 2
# endfunc 
	 lw	$31,16($29)
	 addiu	$sp,$sp,28
	 jr  $31
	 nop
	.end f
# label main
# beginfunc 
	.align	2
	.globl main
	.ent main
main:
	 addiu	$sp,$sp,-56
	 sw	$31,16($29)
	 sw	$16,24($29)
	 sw	$17,28($29)
	 sw	$18,32($29)
	 sw	$19,36($29)
	 sw	$20,40($29)
	 sw	$21,44($29)
	 sw	$22,48($29)
	 sw	$23,52($29)
# call f
	 jal   f
	 nop
# return 0
       li   $2, 0
	 lw	$16,20($29)
	 lw	$17,24($29)
	 lw	$18,28($29)
	 lw	$19,32($29)
	 lw	$20,36($29)
	 lw	$21,40($29)
	 lw	$22,44($29)
	 lw	$23,48($29)
	 lw	$31,16($29)
	 addiu	$sp,$sp,56
	 jr  $31
	 nop
# endfunc 
	 lw	$16,20($29)
	 lw	$17,24($29)
	 lw	$18,28($29)
	 lw	$19,32($29)
	 lw	$20,36($29)
	 lw	$21,40($29)
	 lw	$22,44($29)
	 lw	$23,48($29)
	 lw	$31,16($29)
	 addiu	$sp,$sp,56
	 jr  $31
	 nop
	.end main
