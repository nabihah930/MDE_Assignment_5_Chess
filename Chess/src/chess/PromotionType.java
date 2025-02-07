/**
 */
package chess;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Promotion Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see chess.ChessPackage#getPromotionType()
 * @model
 * @generated
 */
public enum PromotionType implements Enumerator {
	/**
	 * The '<em><b>Queen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUEEN_VALUE
	 * @generated
	 * @ordered
	 */
	QUEEN(0, "Queen", "Queen"),

	/**
	 * The '<em><b>Rook</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROOK_VALUE
	 * @generated
	 * @ordered
	 */
	ROOK(0, "Rook", "Rook"),

	/**
	 * The '<em><b>Bishop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BISHOP_VALUE
	 * @generated
	 * @ordered
	 */
	BISHOP(0, "Bishop", "Bishop"),

	/**
	 * The '<em><b>Knight</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KNIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	KNIGHT(0, "Knight", "Knight");

	/**
	 * The '<em><b>Queen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUEEN
	 * @model name="Queen"
	 * @generated
	 * @ordered
	 */
	public static final int QUEEN_VALUE = 0;

	/**
	 * The '<em><b>Rook</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROOK
	 * @model name="Rook"
	 * @generated
	 * @ordered
	 */
	public static final int ROOK_VALUE = 0;

	/**
	 * The '<em><b>Bishop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BISHOP
	 * @model name="Bishop"
	 * @generated
	 * @ordered
	 */
	public static final int BISHOP_VALUE = 0;

	/**
	 * The '<em><b>Knight</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KNIGHT
	 * @model name="Knight"
	 * @generated
	 * @ordered
	 */
	public static final int KNIGHT_VALUE = 0;

	/**
	 * An array of all the '<em><b>Promotion Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PromotionType[] VALUES_ARRAY =
		new PromotionType[] {
			QUEEN,
			ROOK,
			BISHOP,
			KNIGHT,
		};

	/**
	 * A public read-only list of all the '<em><b>Promotion Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PromotionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Promotion Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PromotionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PromotionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Promotion Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PromotionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PromotionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Promotion Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PromotionType get(int value) {
		switch (value) {
			case QUEEN_VALUE: return QUEEN;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PromotionType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //PromotionType
