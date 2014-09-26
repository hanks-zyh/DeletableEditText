package com.example.deletableedittext;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.zyh.deletableedittext.R;

/**
 * 带删除按钮的EditText
 * @author zyh
 */
public class DeleteableEditText extends LinearLayout {

	private EditText edt_input;
	private ImageButton btn_delete;

	public DeleteableEditText(Context context) {
		super(context);
	}

	public DeleteableEditText(Context context, AttributeSet attrs) {
		super(context, attrs);
		// 获取布局
		View view = LayoutInflater.from(context).inflate(R.layout.edit_delete, this, true);
		edt_input = (EditText) view.findViewById(R.id.edt_input);
		btn_delete = (ImageButton) this.findViewById(R.id.btn_delete);
		edt_input.addTextChangedListener(new TextWatcher() {
			public void onTextChanged(CharSequence s, int start, int before, int count) {
			}

			public void beforeTextChanged(CharSequence s, int start, int count, int after) {
				// btn_delete.setVisibility(edt_input.isFocused() && s.length() > 0 ? View.VISIBLE : View.GONE);
			}

			public void afterTextChanged(Editable s) {
				btn_delete.setVisibility(edt_input.isFocused() && s.length() > 0 ? View.VISIBLE : View.GONE);
			}
		});
		edt_input.setOnFocusChangeListener(new OnFocusChangeListener() {
			public void onFocusChange(View v, boolean hasFocus) {
				btn_delete.setVisibility(edt_input.getText().length() <= 0 || !hasFocus ? 8 : 0);
			}
		});
		btn_delete.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				edt_input.setText("");
			}
		});
	}

	/**
	 * @param str 设置输入框显示的默认值
	 */
	public void setHint(String str) {
		edt_input.setHint(str);
	}

	/**
	 * @return 获取输入框中的内容
	 */
	public String getText() {
		return edt_input.getText().toString().trim();
	}

	/**
	 * @param str 设置输入框内容
	 */
	public void setText(String str) {
		edt_input.setText(str);
	}

	/**
	 * @param id 字符id
	 */
	public void setText(int id) {
		edt_input.setText(id);
	}

}
