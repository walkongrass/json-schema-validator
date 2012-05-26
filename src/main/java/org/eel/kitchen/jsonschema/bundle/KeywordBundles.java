/*
 * Copyright (c) 2012, Francis Galiegue <fgaliegue@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Lesser GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Lesser GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.eel.kitchen.jsonschema.bundle;

import org.eel.kitchen.jsonschema.syntax.AdditionalItemsSyntaxChecker;
import org.eel.kitchen.jsonschema.syntax.AdditionalPropertiesSyntaxChecker;
import org.eel.kitchen.jsonschema.syntax.DependenciesSyntaxChecker;
import org.eel.kitchen.jsonschema.syntax.DescriptionSyntaxChecker;
import org.eel.kitchen.jsonschema.syntax.DisallowSyntaxChecker;
import org.eel.kitchen.jsonschema.syntax.DivisibleBySyntaxChecker;
import org.eel.kitchen.jsonschema.syntax.DollarRefSyntaxChecker;
import org.eel.kitchen.jsonschema.syntax.DollarSchemaSyntaxChecker;
import org.eel.kitchen.jsonschema.syntax.EnumSyntaxChecker;
import org.eel.kitchen.jsonschema.syntax.ExclusiveMaximumSyntaxChecker;
import org.eel.kitchen.jsonschema.syntax.ExclusiveMinimumSyntaxChecker;
import org.eel.kitchen.jsonschema.syntax.ExtendsSyntaxChecker;
import org.eel.kitchen.jsonschema.syntax.FormatSyntaxChecker;
import org.eel.kitchen.jsonschema.syntax.IdSyntaxChecker;
import org.eel.kitchen.jsonschema.syntax.ItemsSyntaxChecker;
import org.eel.kitchen.jsonschema.syntax.MaxItemsSyntaxChecker;
import org.eel.kitchen.jsonschema.syntax.MaxLengthSyntaxChecker;
import org.eel.kitchen.jsonschema.syntax.MaximumSyntaxChecker;
import org.eel.kitchen.jsonschema.syntax.MinItemsSyntaxChecker;
import org.eel.kitchen.jsonschema.syntax.MinLengthSyntaxChecker;
import org.eel.kitchen.jsonschema.syntax.MinimumSyntaxChecker;
import org.eel.kitchen.jsonschema.syntax.PatternPropertiesSyntaxChecker;
import org.eel.kitchen.jsonschema.syntax.PatternSyntaxChecker;
import org.eel.kitchen.jsonschema.syntax.PropertiesSyntaxChecker;
import org.eel.kitchen.jsonschema.syntax.RequiredSyntaxChecker;
import org.eel.kitchen.jsonschema.syntax.TitleSyntaxChecker;
import org.eel.kitchen.jsonschema.syntax.TypeSyntaxChecker;
import org.eel.kitchen.jsonschema.syntax.UniqueItemsSyntaxChecker;

public final class KeywordBundles
{
    private static final KeywordBundle DEFAULT_BUNDLE;

    static {
        Keyword keyword;
        DEFAULT_BUNDLE = new KeywordBundle();

        keyword = KeywordBuilder.forKeyword("additionalItems")
            .withSyntaxChecker(AdditionalItemsSyntaxChecker.getInstance())
            .build();
        DEFAULT_BUNDLE.registerKeyword(keyword);

        keyword = KeywordBuilder.forKeyword("additionalProperties")
            .withSyntaxChecker(AdditionalPropertiesSyntaxChecker.getInstance())
            .build();
        DEFAULT_BUNDLE.registerKeyword(keyword);

        keyword = KeywordBuilder.forKeyword("dependencies")
            .withSyntaxChecker(DependenciesSyntaxChecker.getInstance())
            .build();
        DEFAULT_BUNDLE.registerKeyword(keyword);

        keyword = KeywordBuilder.forKeyword("description")
            .withSyntaxChecker(DescriptionSyntaxChecker.getInstance())
            .build();
        DEFAULT_BUNDLE.registerKeyword(keyword);

        keyword = KeywordBuilder.forKeyword("disallow")
            .withSyntaxChecker(DisallowSyntaxChecker.getInstance())
            .build();
        DEFAULT_BUNDLE.registerKeyword(keyword);

        keyword = KeywordBuilder.forKeyword("divisibleBy")
            .withSyntaxChecker(DivisibleBySyntaxChecker.getInstance())
            .build();
        DEFAULT_BUNDLE.registerKeyword(keyword);

        keyword = KeywordBuilder.forKeyword("enum")
            .withSyntaxChecker(EnumSyntaxChecker.getInstance())
            .build();
        DEFAULT_BUNDLE.registerKeyword(keyword);

        keyword = KeywordBuilder.forKeyword("exclusiveMinimum")
            .withSyntaxChecker(ExclusiveMinimumSyntaxChecker.getInstance())
            .build();
        DEFAULT_BUNDLE.registerKeyword(keyword);

        keyword = KeywordBuilder.forKeyword("exclusiveMaximum")
            .withSyntaxChecker(ExclusiveMaximumSyntaxChecker.getInstance())
            .build();
        DEFAULT_BUNDLE.registerKeyword(keyword);

        keyword = KeywordBuilder.forKeyword("extends")
            .withSyntaxChecker(ExtendsSyntaxChecker.getInstance())
            .build();
        DEFAULT_BUNDLE.registerKeyword(keyword);

        keyword = KeywordBuilder.forKeyword("format")
            .withSyntaxChecker(FormatSyntaxChecker.getInstance())
            .build();
        DEFAULT_BUNDLE.registerKeyword(keyword);

        keyword = KeywordBuilder.forKeyword("id")
            .withSyntaxChecker(IdSyntaxChecker.getInstance())
            .build();
        DEFAULT_BUNDLE.registerKeyword(keyword);

        keyword = KeywordBuilder.forKeyword("items")
            .withSyntaxChecker(ItemsSyntaxChecker.getInstance())
            .build();
        DEFAULT_BUNDLE.registerKeyword(keyword);

        keyword = KeywordBuilder.forKeyword("maximum")
            .withSyntaxChecker(MaximumSyntaxChecker.getInstance())
            .build();
        DEFAULT_BUNDLE.registerKeyword(keyword);

        keyword = KeywordBuilder.forKeyword("maxItems")
            .withSyntaxChecker(MaxItemsSyntaxChecker.getInstance())
            .build();
        DEFAULT_BUNDLE.registerKeyword(keyword);

        keyword = KeywordBuilder.forKeyword("maxLength")
            .withSyntaxChecker(MaxLengthSyntaxChecker.getInstance())
            .build();
        DEFAULT_BUNDLE.registerKeyword(keyword);

        keyword = KeywordBuilder.forKeyword("minimum")
            .withSyntaxChecker(MinimumSyntaxChecker.getInstance())
            .build();
        DEFAULT_BUNDLE.registerKeyword(keyword);

        keyword = KeywordBuilder.forKeyword("minItems")
            .withSyntaxChecker(MinItemsSyntaxChecker.getInstance())
            .build();
        DEFAULT_BUNDLE.registerKeyword(keyword);

        keyword = KeywordBuilder.forKeyword("minLength")
            .withSyntaxChecker(MinLengthSyntaxChecker.getInstance())
            .build();
        DEFAULT_BUNDLE.registerKeyword(keyword);

        keyword = KeywordBuilder.forKeyword("pattern")
            .withSyntaxChecker(PatternSyntaxChecker.getInstance())
            .build();
        DEFAULT_BUNDLE.registerKeyword(keyword);

        keyword = KeywordBuilder.forKeyword("patternProperties")
            .withSyntaxChecker(PatternPropertiesSyntaxChecker.getInstance())
            .build();
        DEFAULT_BUNDLE.registerKeyword(keyword);

        keyword = KeywordBuilder.forKeyword("properties")
            .withSyntaxChecker(PropertiesSyntaxChecker.getInstance())
            .build();
        DEFAULT_BUNDLE.registerKeyword(keyword);

        keyword = KeywordBuilder.forKeyword("required")
            .withSyntaxChecker(RequiredSyntaxChecker.getInstance())
            .build();
        DEFAULT_BUNDLE.registerKeyword(keyword);

        keyword = KeywordBuilder.forKeyword("title")
            .withSyntaxChecker(TitleSyntaxChecker.getInstance())
            .build();
        DEFAULT_BUNDLE.registerKeyword(keyword);

        keyword = KeywordBuilder.forKeyword("type")
            .withSyntaxChecker(TypeSyntaxChecker.getInstance())
            .build();
        DEFAULT_BUNDLE.registerKeyword(keyword);

        keyword = KeywordBuilder.forKeyword("uniqueItems")
            .withSyntaxChecker(UniqueItemsSyntaxChecker.getInstance())
            .build();
        DEFAULT_BUNDLE.registerKeyword(keyword);

        keyword = KeywordBuilder.forKeyword("$ref")
            .withSyntaxChecker(DollarRefSyntaxChecker.getInstance())
            .build();
        DEFAULT_BUNDLE.registerKeyword(keyword);

        keyword = KeywordBuilder.forKeyword("$schema")
            .withSyntaxChecker(DollarSchemaSyntaxChecker.getInstance())
            .build();
        DEFAULT_BUNDLE.registerKeyword(keyword);
    }

    public static KeywordBundle defaultBundle()
    {
        return DEFAULT_BUNDLE.copy();
    }
}
