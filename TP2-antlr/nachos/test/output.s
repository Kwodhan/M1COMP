.rdata
.align 2
$LC0:
       .ascii	"%d\000"
       .align 2
L12:
       .ascii	"Tableau de taille \000"
       .align 2
L13:
       .ascii	" = [\000"
       .align 2
L14:
       .ascii	",\000"
       .align 2
L19:
       .ascii	"]\012\000"
.text
# label main
# beginfunc 
	.align	2
	.globl main
	.ent main
main:
	 addiu	$sp,$sp,-104
	 sw	$31,16($29)
	 sw	$16,24($29)
	 sw	$17,28($29)
	 sw	$18,32($29)
	 sw	$19,36($29)
	 sw	$20,40($29)
	 sw	$21,44($29)
	 sw	$22,48($29)
	 sw	$23,52($29)
# var i
# var t
# var x
# i = 0
       li   $8, 0
# label L10
       sw  $8,56($29)
L10:
# var T_0
# T_0 = 8 - i
       li   $9, 8
       lw  $8,56($29)
	sub $8, $9, $8
# ifz T_0 goto L11
       sw  $8,96($29)
	beq  $8,0,L11
# x =  call L8
       addiu   $5,$29,92
       lui   $4,%hi($LC0)
       addiu   $4,$4,%lo($LC0)
	 jal   n_read_int
	 nop
       sw   $2,92($29)
# t [ i ] = x
       lw  $8,56($29)
       li   $9,4
       mult   $8,$9
       mflo   $8
       add   $9,$29,60
       add   $8,$8,$9
       move  $9,$2
       sw  $9,0($8)
# var T_1
# T_1 = i + 1
       lw  $10,56($29)
       li   $8, 1
	add $8, $10, $8
# i = T_1
       sw  $8,100($29)
# goto L10
       sw  $2,92($29)
       sw  $8,56($29)
       sw  $9,92($29)
	j  L10
# label L11
L11:
# arg 8
       li   $8, 8
	 sw   $8,0($29)
	move   $4,$8
# arg t
	 add   $9,$29,60
	 sw   $9,4($29)
	move   $5,$9
# call printtab
	 jal   printtab
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
	 addiu	$sp,$sp,104
	 jr  $31
	 nop
	.end main
# label printtab
# beginfunc 
	.align	2
	.globl printtab
	.ent printtab
printtab:
	 addiu	$sp,$sp,-40
	 sw	$31,16($29)
# var size
# var t
# var i
# arg L12
       lui   $8,%hi(L12)
       addiu   $8,$8,%lo(L12)
	 sw   $8,0($29)
	move   $4,$8
# call L4
	 jal   n_printf
	 nop
# arg size
       lw  $8,40($29)
	 sw   $8,0($29)
	move   $4,$8
# call L2
       move $5,$4
       lui   $4,%hi($LC0)
       addiu   $4,$4,%lo($LC0)
	 jal   n_printf
	 nop
# arg L13
       lui   $8,%hi(L13)
       addiu   $8,$8,%lo(L13)
	 sw   $8,0($29)
	move   $4,$8
# call L4
	 jal   n_printf
	 nop
# i = 0
       li   $8, 0
# label L17
       sw  $8,24($29)
L17:
# var T_2
# T_2 = size - i
       lw  $9,40($29)
       lw  $8,24($29)
	sub $8, $9, $8
# ifz T_2 goto L18
       sw  $8,28($29)
	beq  $8,0,L18
# ifz i goto L15
       lw  $10,24($29)
	beq  $10,0,L15
# arg L14
       lui   $11,%hi(L14)
       addiu   $11,$11,%lo(L14)
	 sw   $11,0($29)
	move   $4,$11
# call L4
	 jal   n_printf
	 nop
# goto L16
	j  L16
# label L15
L15:
# label L16
L16:
# var T_3
# T_3 = t [ i ]
       lw  $8,24($29)
       li   $9,4
       mult   $8,$9
       mflo   $8
       lw  $9,44($29)
       add   $8,$8,$9
       lw  $8,0($8)
# arg T_3
       sw  $8,32($29)
	 sw   $8,0($29)
	move   $4,$8
# call L2
       move $5,$4
       lui   $4,%hi($LC0)
       addiu   $4,$4,%lo($LC0)
	 jal   n_printf
	 nop
# var T_4
# T_4 = i + 1
       lw  $9,24($29)
       li   $8, 1
	add $8, $9, $8
# i = T_4
       sw  $8,36($29)
# goto L17
       sw  $8,24($29)
	j  L17
# label L18
L18:
# arg L19
       lui   $8,%hi(L19)
       addiu   $8,$8,%lo(L19)
	 sw   $8,0($29)
	move   $4,$8
# call L4
	 jal   n_printf
	 nop
# endfunc 
	 lw	$31,16($29)
	 addiu	$sp,$sp,40
	 jr  $31
	 nop
	.end printtab
